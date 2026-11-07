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

public interface IBusModelUuidTypeTableObj
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
	 *	Instantiate a new UuidType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelUuidTypeObj newInstance();

	/**
	 *	Instantiate a new UuidType edition of the specified UuidType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelUuidTypeEditObj newEditInstance( IBusModelUuidTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidTypeObj realiseUuidType( IBusModelUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidTypeObj createUuidType( IBusModelUuidTypeObj Obj );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuidTypeObj readUuidType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a UuidType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuidTypeObj readUuidType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelUuidTypeObj readCachedUuidType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeUuidType( IBusModelUuidTypeObj obj );

	void deepDisposeUuidType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidTypeObj lockUuidType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuidTypeObj> readAllUuidType();

	/**
	 *	Return a sorted map of all the UuidType-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuidTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuidTypeObj> readAllUuidType( boolean forceRead );

	List<IBusModelUuidTypeObj> readCachedAllUuidType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidTypeObj readUuidTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidTypeObj readUuidTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidTypeObj readUuidTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidTypeObj readUuidTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelUuidTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidTypeObj> readUuidTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelUuidTypeObj readCachedUuidTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelUuidTypeObj readCachedUuidTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelUuidTypeObj> readCachedUuidTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeUuidTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuidTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuidTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeUuidTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeUuidTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeUuidTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeUuidTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeUuidTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidTypeObj updateUuidType( IBusModelUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidType( IBusModelUuidTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The UuidType key attribute of the instance generating the id.
	 */
	void deleteUuidTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelUuidTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuidTypeObj refreshed cache instance.
	 */
	IBusModelUuidTypeObj moveUpUuidType( IBusModelUuidTypeObj Obj );

	/**
	 *	Move the BusModelUuidTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuidTypeObj refreshed cache instance.
	 */
	IBusModelUuidTypeObj moveDownUuidType( IBusModelUuidTypeObj Obj );
}
