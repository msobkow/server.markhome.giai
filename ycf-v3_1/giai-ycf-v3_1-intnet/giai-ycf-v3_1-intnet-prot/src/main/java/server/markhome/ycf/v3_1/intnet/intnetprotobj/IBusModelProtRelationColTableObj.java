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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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

public interface IBusModelProtRelationColTableObj
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
	 *	Instantiate a new RelationCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtRelationColObj newInstance();

	/**
	 *	Instantiate a new RelationCol edition of the specified RelationCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtRelationColEditObj newEditInstance( IBusModelProtRelationColObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtRelationColEditObj instance, which may be a subclass of a RelationCol instance.
	 */
	IBusModelProtRelationColObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRelationColObj realiseRelationCol( IBusModelProtRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRelationColObj createRelationCol( IBusModelProtRelationColObj Obj );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtRelationColObj readRelationCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtRelationColObj readRelationCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtRelationColObj readCachedRelationCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeRelationCol( IBusModelProtRelationColObj obj );

	void deepDisposeRelationCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRelationColObj lockRelationCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtRelationColObj> readAllRelationCol();

	/**
	 *	Return a sorted map of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtRelationColObj> readAllRelationCol( boolean forceRead );

	List<IBusModelProtRelationColObj> readCachedAllRelationCol();

	/**
	 *	Get the IBusModelProtRelationColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRelationColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRelationColObj readRelationColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtRelationColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRelationColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRelationColObj readRelationColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRelationColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRelationColObj readRelationColByUNameIdx(ICFKeyHash256 RelationId,
		String Name );

	/**
	 *	Get the IBusModelProtRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRelationColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRelationColObj readRelationColByUNameIdx(ICFKeyHash256 RelationId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelationIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByFromColIdx( ICFKeyHash256 FromColId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByFromColIdx( ICFKeyHash256 FromColId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByToColIdx( ICFKeyHash256 ToColId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByToColIdx( ICFKeyHash256 ToColId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelPrevIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelPrevIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelNextIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtRelationColObj> instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRelationColObj> cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRelationColObj> readRelationColByRelNextIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtRelationColObj readCachedRelationColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtRelationColObj readCachedRelationColByUNameIdx( ICFKeyHash256 RelationId,
		String Name );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByRelationIdx( ICFKeyHash256 RelationId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByFromColIdx( ICFKeyHash256 FromColId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByToColIdx( ICFKeyHash256 ToColId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByRelPrevIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtRelationColObj>> readCachedRelationColByRelNextIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	void deepDisposeRelationColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeRelationColByUNameIdx( ICFKeyHash256 RelationId,
		String Name );

	void deepDisposeRelationColByRelationIdx( ICFKeyHash256 RelationId );

	void deepDisposeRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeRelationColByFromColIdx( ICFKeyHash256 FromColId );

	void deepDisposeRelationColByToColIdx( ICFKeyHash256 ToColId );

	void deepDisposeRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeRelationColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeRelationColByRelPrevIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	void deepDisposeRelationColByRelNextIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRelationColObj updateRelationCol( IBusModelProtRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelationCol( IBusModelProtRelationColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByUNameIdx(ICFKeyHash256 RelationId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByFromColIdx( ICFKeyHash256 FromColId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByToColIdx( ICFKeyHash256 ToColId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelPrevIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelNextIdx( ICFKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtRelationColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtRelationColObj refreshed cache instance.
	 */
	IBusModelProtRelationColObj moveUpRelationCol( IBusModelProtRelationColObj Obj );

	/**
	 *	Move the IBusModelProtRelationColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtRelationColObj refreshed cache instance.
	 */
	IBusModelProtRelationColObj moveDownRelationCol( IBusModelProtRelationColObj Obj );
}
