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

public interface IBusModelUInt16TypeTableObj
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
	 *	Instantiate a new UInt16Type instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelUInt16TypeObj newInstance();

	/**
	 *	Instantiate a new UInt16Type edition of the specified UInt16Type instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelUInt16TypeEditObj newEditInstance( IBusModelUInt16TypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt16TypeObj realiseUInt16Type( IBusModelUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt16TypeObj createUInt16Type( IBusModelUInt16TypeObj Obj );

	/**
	 *	Read a UInt16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUInt16TypeObj readUInt16Type( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a UInt16Type-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt16Type-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUInt16TypeObj readUInt16Type( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelUInt16TypeObj readCachedUInt16Type( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeUInt16Type( IBusModelUInt16TypeObj obj );

	void deepDisposeUInt16Type( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt16TypeObj lockUInt16Type( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the UInt16Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelUInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUInt16TypeObj> readAllUInt16Type();

	/**
	 *	Return a sorted map of all the UInt16Type-derived instances in the database.
	 *
	 *	@return	List of IBusModelUInt16TypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUInt16TypeObj> readAllUInt16Type( boolean forceRead );

	List<IBusModelUInt16TypeObj> readCachedAllUInt16Type();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt16TypeObj readUInt16TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt16TypeObj readUInt16TypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt16TypeObj readUInt16TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt16TypeObj readUInt16TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelUInt16TypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt16TypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt16TypeObj> readUInt16TypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelUInt16TypeObj readCachedUInt16TypeByIdIdx( ICFKeyHash256 Id );

	IBusModelUInt16TypeObj readCachedUInt16TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelUInt16TypeObj> readCachedUInt16TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeUInt16TypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUInt16TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt16TypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUInt16TypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeUInt16TypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeUInt16TypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeUInt16TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeUInt16TypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeUInt16TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt16TypeObj updateUInt16Type( IBusModelUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt16Type( IBusModelUInt16TypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt16Type key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The UInt16Type key attribute of the instance generating the id.
	 */
	void deleteUInt16TypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelUInt16TypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUInt16TypeObj refreshed cache instance.
	 */
	IBusModelUInt16TypeObj moveUpUInt16Type( IBusModelUInt16TypeObj Obj );

	/**
	 *	Move the BusModelUInt16TypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUInt16TypeObj refreshed cache instance.
	 */
	IBusModelUInt16TypeObj moveDownUInt16Type( IBusModelUInt16TypeObj Obj );
}
