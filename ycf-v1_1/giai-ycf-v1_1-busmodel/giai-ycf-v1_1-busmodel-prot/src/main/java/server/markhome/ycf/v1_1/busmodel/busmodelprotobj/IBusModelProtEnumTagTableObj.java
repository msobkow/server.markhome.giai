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

public interface IBusModelProtEnumTagTableObj
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
	 *	Instantiate a new EnumTag instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtEnumTagObj newInstance();

	/**
	 *	Instantiate a new EnumTag edition of the specified EnumTag instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtEnumTagEditObj newEditInstance( IBusModelProtEnumTagObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtEnumTagEditObj instance, which may be a subclass of a EnumTag instance.
	 */
	IBusModelProtEnumTagObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumTagObj realiseEnumTag( IBusModelProtEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumTagObj createEnumTag( IBusModelProtEnumTagObj Obj );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtEnumTagObj readEnumTag( CFDbKeyHash256 pkey );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtEnumTagObj readEnumTag( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtEnumTagObj readCachedEnumTag( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeEnumTag( IBusModelProtEnumTagObj obj );

	void deepDisposeEnumTag( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumTagObj lockEnumTag( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtEnumTagObj> readAllEnumTag();

	/**
	 *	Return a sorted map of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtEnumTagObj> readAllEnumTag( boolean forceRead );

	List<IBusModelProtEnumTagObj> readCachedAllEnumTag();

	/**
	 *	Get the IBusModelProtEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtEnumTagObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumTagObj readEnumTagByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtEnumTagObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumTagObj readEnumTagByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByEnumIdx( ICFKeyHash256 EnumId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtEnumTagObj cached instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumTagObj readEnumTagByEnumNameIdx(ICFKeyHash256 EnumId,
		String Name );

	/**
	 *	Get the IBusModelProtEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtEnumTagObj refreshed instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumTagObj readEnumTagByEnumNameIdx(ICFKeyHash256 EnumId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtEnumTagObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtEnumTagObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumTagObj> readEnumTagByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtEnumTagObj readCachedEnumTagByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtEnumTagObj>> readCachedEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	List<List<IBusModelProtEnumTagObj>> readCachedEnumTagByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtEnumTagObj readCachedEnumTagByEnumNameIdx( ICFKeyHash256 EnumId,
		String Name );

	List<List<IBusModelProtEnumTagObj>> readCachedEnumTagByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtEnumTagObj>> readCachedEnumTagByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeEnumTagByIdIdx( ICFKeyHash256 Id );

	void deepDisposeEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	void deepDisposeEnumTagByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeEnumTagByEnumNameIdx( ICFKeyHash256 EnumId,
		String Name );

	void deepDisposeEnumTagByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeEnumTagByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumTagObj updateEnumTag( IBusModelProtEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumTag( IBusModelProtEnumTagObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByEnumNameIdx(ICFKeyHash256 EnumId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtEnumTagObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtEnumTagObj refreshed cache instance.
	 */
	IBusModelProtEnumTagObj moveUpEnumTag( IBusModelProtEnumTagObj Obj );

	/**
	 *	Move the IBusModelProtEnumTagObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtEnumTagObj refreshed cache instance.
	 */
	IBusModelProtEnumTagObj moveDownEnumTag( IBusModelProtEnumTagObj Obj );
}
