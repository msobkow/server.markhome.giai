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

public interface IBusModelNumberTypeTableObj
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
	 *	Instantiate a new NumberType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNumberTypeObj newInstance();

	/**
	 *	Instantiate a new NumberType edition of the specified NumberType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNumberTypeEditObj newEditInstance( IBusModelNumberTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberTypeObj realiseNumberType( IBusModelNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberTypeObj createNumberType( IBusModelNumberTypeObj Obj );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNumberTypeObj readNumberType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NumberType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNumberTypeObj readNumberType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNumberTypeObj readCachedNumberType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNumberType( IBusModelNumberTypeObj obj );

	void deepDisposeNumberType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberTypeObj lockNumberType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNumberTypeObj> readAllNumberType();

	/**
	 *	Return a sorted map of all the NumberType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNumberTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNumberTypeObj> readAllNumberType( boolean forceRead );

	List<IBusModelNumberTypeObj> readCachedAllNumberType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberTypeObj readNumberTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberTypeObj readNumberTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberTypeObj readNumberTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberTypeObj readNumberTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelNumberTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberTypeObj> readNumberTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelNumberTypeObj readCachedNumberTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelNumberTypeObj readCachedNumberTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelNumberTypeObj> readCachedNumberTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeNumberTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNumberTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNumberTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNumberTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNumberTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNumberTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNumberTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNumberTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNumberTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberTypeObj updateNumberType( IBusModelNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberType( IBusModelNumberTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The NumberType key attribute of the instance generating the id.
	 */
	void deleteNumberTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelNumberTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNumberTypeObj refreshed cache instance.
	 */
	IBusModelNumberTypeObj moveUpNumberType( IBusModelNumberTypeObj Obj );

	/**
	 *	Move the BusModelNumberTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNumberTypeObj refreshed cache instance.
	 */
	IBusModelNumberTypeObj moveDownNumberType( IBusModelNumberTypeObj Obj );
}
