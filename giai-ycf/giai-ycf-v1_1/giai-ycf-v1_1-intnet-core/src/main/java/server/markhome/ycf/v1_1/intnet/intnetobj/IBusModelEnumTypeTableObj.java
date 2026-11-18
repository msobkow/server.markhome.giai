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

public interface IBusModelEnumTypeTableObj
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
	 *	Instantiate a new EnumType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelEnumTypeObj newInstance();

	/**
	 *	Instantiate a new EnumType edition of the specified EnumType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelEnumTypeEditObj newEditInstance( IBusModelEnumTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTypeObj realiseEnumType( IBusModelEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTypeObj createEnumType( IBusModelEnumTypeObj Obj );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelEnumTypeObj readEnumType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a EnumType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelEnumTypeObj readEnumType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelEnumTypeObj readCachedEnumType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeEnumType( IBusModelEnumTypeObj obj );

	void deepDisposeEnumType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTypeObj lockEnumType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IBusModelEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelEnumTypeObj> readAllEnumType();

	/**
	 *	Return a sorted map of all the EnumType-derived instances in the database.
	 *
	 *	@return	List of IBusModelEnumTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelEnumTypeObj> readAllEnumType( boolean forceRead );

	List<IBusModelEnumTypeObj> readCachedAllEnumType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTypeObj readEnumTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTypeObj readEnumTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTypeObj readEnumTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTypeObj readEnumTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelEnumTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTypeObj> readEnumTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelEnumTypeObj readCachedEnumTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelEnumTypeObj readCachedEnumTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelEnumTypeObj> readCachedEnumTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeEnumTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeEnumTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeEnumTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeEnumTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeEnumTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeEnumTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeEnumTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeEnumTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeEnumTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTypeObj updateEnumType( IBusModelEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumType( IBusModelEnumTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The EnumType key attribute of the instance generating the id.
	 */
	void deleteEnumTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelEnumTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelEnumTypeObj refreshed cache instance.
	 */
	IBusModelEnumTypeObj moveUpEnumType( IBusModelEnumTypeObj Obj );

	/**
	 *	Move the BusModelEnumTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelEnumTypeObj refreshed cache instance.
	 */
	IBusModelEnumTypeObj moveDownEnumType( IBusModelEnumTypeObj Obj );
}
