// Description: Java 25 Public Table Object interface for BusModelPub.

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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubRelationColTableObj
{
	public IBusModelPubSchemaObj getSchema();
	public void setSchema( IBusModelPubSchemaObj value );

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
	IBusModelPubRelationColObj newInstance();

	/**
	 *	Instantiate a new RelationCol edition of the specified RelationCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubRelationColEditObj newEditInstance( IBusModelPubRelationColObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelPubRelationColObj instance, which may be a subclass of a RelationCol instance.
	 */
	IBusModelPubRelationColObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationColObj realiseRelationCol( IBusModelPubRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationColObj createRelationCol( IBusModelPubRelationColObj Obj );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubRelationColObj readRelationCol( ICFKeyHash256 pkey );

	/**
	 *	Read a RelationCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RelationCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubRelationColObj readRelationCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubRelationColObj readCachedRelationCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeRelationCol( IBusModelPubRelationColObj obj );

	void deepDisposeRelationCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationColObj lockRelationCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubRelationColObj> readAllRelationCol();

	/**
	 *	Return a sorted map of all the RelationCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubRelationColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubRelationColObj> readAllRelationCol( boolean forceRead );

	List<IBusModelPubRelationColObj> readCachedAllRelationCol();

	/**
	 *	Get the BusModelPubRelationColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationColObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationColObj readRelationColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubRelationColObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationColObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationColObj readRelationColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationColObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationColObj readRelationColByUNameIdx(CFDbKeyHash256 RelationId,
		String Name );

	/**
	 *	Get the BusModelPubRelationColObj instance for the unique UNameIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationColObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationColObj readRelationColByUNameIdx(CFDbKeyHash256 RelationId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelationIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelationIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByFromColIdx( CFDbKeyHash256 FromColId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate FromColIdx key.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate FromColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByFromColIdx( CFDbKeyHash256 FromColId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByToColIdx( CFDbKeyHash256 ToColId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate ToColIdx key.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate ToColIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByToColIdx( CFDbKeyHash256 ToColId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelPrevIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelPrevIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelPrevIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelNextIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubRelationColObj instances sorted by their primary keys for the duplicate RelNextIdx key.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationColObj cached instances sorted by their primary keys for the duplicate RelNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationColObj> readRelationColByRelNextIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubRelationColObj readCachedRelationColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubRelationColObj readCachedRelationColByUNameIdx( CFDbKeyHash256 RelationId,
		String Name );

	List<IBusModelPubRelationColObj> readCachedRelationColByRelationIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubRelationColObj> readCachedRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubRelationColObj> readCachedRelationColByFromColIdx( CFDbKeyHash256 FromColId );

	List<IBusModelPubRelationColObj> readCachedRelationColByToColIdx( CFDbKeyHash256 ToColId );

	List<IBusModelPubRelationColObj> readCachedRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubRelationColObj> readCachedRelationColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubRelationColObj> readCachedRelationColByRelPrevIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubRelationColObj> readCachedRelationColByRelNextIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	void deepDisposeRelationColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeRelationColByUNameIdx( CFDbKeyHash256 RelationId,
		String Name );

	void deepDisposeRelationColByRelationIdx( CFDbKeyHash256 RelationId );

	void deepDisposeRelationColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeRelationColByFromColIdx( CFDbKeyHash256 FromColId );

	void deepDisposeRelationColByToColIdx( CFDbKeyHash256 ToColId );

	void deepDisposeRelationColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeRelationColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeRelationColByRelPrevIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	void deepDisposeRelationColByRelNextIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationColObj updateRelationCol( IBusModelPubRelationColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelationCol( IBusModelPubRelationColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByUNameIdx(CFDbKeyHash256 RelationId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelationIdx( CFDbKeyHash256 RelationId );

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
	void deleteRelationColByFromColIdx( CFDbKeyHash256 FromColId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByToColIdx( CFDbKeyHash256 ToColId );

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
	void deleteRelationColByRelPrevIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 */
	void deleteRelationColByRelNextIdx( CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubRelationColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubRelationColObj refreshed cache instance.
	 */
	IBusModelPubRelationColObj moveUpRelationCol( IBusModelPubRelationColObj Obj );

	/**
	 *	Move the BusModelPubRelationColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubRelationColObj refreshed cache instance.
	 */
	IBusModelPubRelationColObj moveDownRelationCol( IBusModelPubRelationColObj Obj );
}
