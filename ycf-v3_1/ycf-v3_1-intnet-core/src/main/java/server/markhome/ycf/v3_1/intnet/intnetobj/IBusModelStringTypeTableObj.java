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

public interface IBusModelStringTypeTableObj
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
	 *	Instantiate a new StringType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelStringTypeObj newInstance();

	/**
	 *	Instantiate a new StringType edition of the specified StringType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelStringTypeEditObj newEditInstance( IBusModelStringTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelStringTypeObj realiseStringType( IBusModelStringTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelStringTypeObj createStringType( IBusModelStringTypeObj Obj );

	/**
	 *	Read a StringType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelStringTypeObj readStringType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a StringType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelStringTypeObj readStringType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelStringTypeObj readCachedStringType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeStringType( IBusModelStringTypeObj obj );

	void deepDisposeStringType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelStringTypeObj lockStringType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the StringType-derived instances in the database.
	 *
	 *	@return	List of IBusModelStringTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelStringTypeObj> readAllStringType();

	/**
	 *	Return a sorted map of all the StringType-derived instances in the database.
	 *
	 *	@return	List of IBusModelStringTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelStringTypeObj> readAllStringType( boolean forceRead );

	List<IBusModelStringTypeObj> readCachedAllStringType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelStringTypeObj readStringTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelStringTypeObj readStringTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelStringTypeObj readStringTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelStringTypeObj readStringTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelStringTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelStringTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelStringTypeObj> readStringTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelStringTypeObj readCachedStringTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelStringTypeObj readCachedStringTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelStringTypeObj> readCachedStringTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelStringTypeObj> readCachedStringTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelStringTypeObj> readCachedStringTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelStringTypeObj> readCachedStringTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelStringTypeObj> readCachedStringTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelStringTypeObj> readCachedStringTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelStringTypeObj> readCachedStringTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeStringTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeStringTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeStringTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeStringTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeStringTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeStringTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeStringTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeStringTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeStringTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelStringTypeObj updateStringType( IBusModelStringTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringType( IBusModelStringTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 */
	void deleteStringTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelStringTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelStringTypeObj refreshed cache instance.
	 */
	IBusModelStringTypeObj moveUpStringType( IBusModelStringTypeObj Obj );

	/**
	 *	Move the BusModelStringTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelStringTypeObj refreshed cache instance.
	 */
	IBusModelStringTypeObj moveDownStringType( IBusModelStringTypeObj Obj );
}
