// Description: Java 25 Protected Table Object interface for BusModelProt.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtTextTypeTableObj
{
	public IBusModelProtSchemaObj getSchema();
	public void setSchema( IBusModelProtSchemaObj value );

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
	 *	Instantiate a new TextType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTextTypeObj newInstance();

	/**
	 *	Instantiate a new TextType edition of the specified TextType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTextTypeEditObj newEditInstance( IBusModelProtTextTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTextTypeObj realiseTextType( IBusModelProtTextTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTextTypeObj createTextType( IBusModelProtTextTypeObj Obj );

	/**
	 *	Read a TextType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTextTypeObj readTextType( CFDbKeyHash256 pkey );

	/**
	 *	Read a TextType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTextTypeObj readTextType( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTextTypeObj readCachedTextType( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTextType( IBusModelProtTextTypeObj obj );

	void deepDisposeTextType( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTextTypeObj lockTextType( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TextType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTextTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTextTypeObj> readAllTextType();

	/**
	 *	Return a sorted map of all the TextType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTextTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTextTypeObj> readAllTextType( boolean forceRead );

	List<IBusModelProtTextTypeObj> readCachedAllTextType();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTextTypeObj readTextTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTextTypeObj readTextTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTextTypeObj readTextTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTextTypeObj readTextTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTextTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTextTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTextTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTextTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtTextTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TextType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTextTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTextTypeObj> readTextTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTextTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTextTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTextTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTextTypeObj>> readCachedTextTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTextTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTextTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTextTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTextTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTextTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTextTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTextTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTextTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTextTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTextTypeObj updateTextType( IBusModelProtTextTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextType( IBusModelProtTextTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TextType key attribute of the instance generating the id.
	 */
	void deleteTextTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtTextTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTextTypeObj refreshed cache instance.
	 */
	IBusModelProtTextTypeObj moveUpTextType( IBusModelProtTextTypeObj Obj );

	/**
	 *	Move the IBusModelProtTextTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTextTypeObj refreshed cache instance.
	 */
	IBusModelProtTextTypeObj moveDownTextType( IBusModelProtTextTypeObj Obj );
}
