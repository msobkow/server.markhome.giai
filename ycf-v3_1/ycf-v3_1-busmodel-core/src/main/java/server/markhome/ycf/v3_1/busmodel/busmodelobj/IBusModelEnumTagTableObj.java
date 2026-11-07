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

public interface IBusModelEnumTagTableObj
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
	 *	Instantiate a new EnumTag instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelEnumTagObj newInstance();

	/**
	 *	Instantiate a new EnumTag edition of the specified EnumTag instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelEnumTagEditObj newEditInstance( IBusModelEnumTagObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelEnumTagObj instance, which may be a subclass of a EnumTag instance.
	 */
	IBusModelEnumTagObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTagObj realiseEnumTag( IBusModelEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTagObj createEnumTag( IBusModelEnumTagObj Obj );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelEnumTagObj readEnumTag( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a EnumTag-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumTag-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelEnumTagObj readEnumTag( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelEnumTagObj readCachedEnumTag( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeEnumTag( IBusModelEnumTagObj obj );

	void deepDisposeEnumTag( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTagObj lockEnumTag( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IBusModelEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelEnumTagObj> readAllEnumTag();

	/**
	 *	Return a sorted map of all the EnumTag-derived instances in the database.
	 *
	 *	@return	List of IBusModelEnumTagObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelEnumTagObj> readAllEnumTag( boolean forceRead );

	List<IBusModelEnumTagObj> readCachedAllEnumTag();

	/**
	 *	Get the BusModelEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	BusModelEnumTagObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTagObj readEnumTagByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelEnumTagObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	BusModelEnumTagObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTagObj readEnumTagByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate EnumIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate EnumIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByEnumIdx( ICFKeyHash256 EnumId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	BusModelEnumTagObj cached instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTagObj readEnumTagByEnumNameIdx(ICFKeyHash256 EnumId,
		String Name );

	/**
	 *	Get the BusModelEnumTagObj instance for the unique EnumNameIdx key.
	 *
	 *	@param	EnumId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	BusModelEnumTagObj refreshed instance for the unique EnumNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelEnumTagObj readEnumTagByEnumNameIdx(ICFKeyHash256 EnumId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelEnumTagObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelEnumTagObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelEnumTagObj> readEnumTagByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelEnumTagObj readCachedEnumTagByIdIdx( ICFKeyHash256 Id );

	List<IBusModelEnumTagObj> readCachedEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	List<IBusModelEnumTagObj> readCachedEnumTagByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelEnumTagObj readCachedEnumTagByEnumNameIdx( ICFKeyHash256 EnumId,
		String Name );

	List<IBusModelEnumTagObj> readCachedEnumTagByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelEnumTagObj> readCachedEnumTagByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeEnumTagByIdIdx( ICFKeyHash256 Id );

	void deepDisposeEnumTagByEnumIdx( ICFKeyHash256 EnumId );

	void deepDisposeEnumTagByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeEnumTagByEnumNameIdx( ICFKeyHash256 EnumId,
		String Name );

	void deepDisposeEnumTagByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeEnumTagByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelEnumTagObj updateEnumTag( IBusModelEnumTagObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumTag( IBusModelEnumTagObj Obj );

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
	void deleteEnumTagByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

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
	void deleteEnumTagByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The EnumTag key attribute of the instance generating the id.
	 */
	void deleteEnumTagByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelEnumTagObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelEnumTagObj refreshed cache instance.
	 */
	IBusModelEnumTagObj moveUpEnumTag( IBusModelEnumTagObj Obj );

	/**
	 *	Move the BusModelEnumTagObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelEnumTagObj refreshed cache instance.
	 */
	IBusModelEnumTagObj moveDownEnumTag( IBusModelEnumTagObj Obj );
}
