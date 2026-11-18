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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

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

public interface IBusModelTimestampTypeTableObj
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
	 *	Instantiate a new TimestampType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTimestampTypeObj newInstance();

	/**
	 *	Instantiate a new TimestampType edition of the specified TimestampType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTimestampTypeEditObj newEditInstance( IBusModelTimestampTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTimestampTypeObj realiseTimestampType( IBusModelTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTimestampTypeObj createTimestampType( IBusModelTimestampTypeObj Obj );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimestampTypeObj readTimestampType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TimestampType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimestampType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimestampTypeObj readTimestampType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTimestampTypeObj readCachedTimestampType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTimestampType( IBusModelTimestampTypeObj obj );

	void deepDisposeTimestampType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTimestampTypeObj lockTimestampType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimestampTypeObj> readAllTimestampType();

	/**
	 *	Return a sorted map of all the TimestampType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimestampTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimestampTypeObj> readAllTimestampType( boolean forceRead );

	List<IBusModelTimestampTypeObj> readCachedAllTimestampType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimestampTypeObj readTimestampTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimestampTypeObj readTimestampTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimestampTypeObj readTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimestampTypeObj readTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelTimestampTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimestampTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimestampTypeObj> readTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelTimestampTypeObj readCachedTimestampTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelTimestampTypeObj readCachedTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTimestampTypeObj> readCachedTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTimestampTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimestampTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTimestampTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTimestampTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelTimestampTypeObj updateTimestampType( IBusModelTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimestampType( IBusModelTimestampTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelTimestampTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimestampTypeObj refreshed cache instance.
	 */
	IBusModelTimestampTypeObj moveUpTimestampType( IBusModelTimestampTypeObj Obj );

	/**
	 *	Move the BusModelTimestampTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimestampTypeObj refreshed cache instance.
	 */
	IBusModelTimestampTypeObj moveDownTimestampType( IBusModelTimestampTypeObj Obj );
}
