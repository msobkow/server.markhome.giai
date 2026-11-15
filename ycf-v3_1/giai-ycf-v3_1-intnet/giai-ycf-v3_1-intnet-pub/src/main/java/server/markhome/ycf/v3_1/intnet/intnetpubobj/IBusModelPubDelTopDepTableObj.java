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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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

public interface IBusModelPubDelTopDepTableObj
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
	 *	Instantiate a new DelTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDelTopDepObj newInstance();

	/**
	 *	Instantiate a new DelTopDep edition of the specified DelTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDelTopDepEditObj newEditInstance( IBusModelPubDelTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDelTopDepObj realiseDelTopDep( IBusModelPubDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDelTopDepObj createDelTopDep( IBusModelPubDelTopDepObj Obj );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDep( ICFKeyHash256 pkey );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDep( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDelTopDepObj readCachedDelTopDep( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDelTopDep( IBusModelPubDelTopDepObj obj );

	void deepDisposeDelTopDep( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDelTopDepObj lockDelTopDep( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readAllDelTopDep();

	/**
	 *	Return a sorted map of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readAllDelTopDep( boolean forceRead );

	List<IBusModelPubDelTopDepObj> readCachedAllDelTopDep();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDepByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDelDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDelDepIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDelTopDepTblIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByDelTopDepTblIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubDelTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDepByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelPubDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubDelTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDelTopDepObj readDelTopDepByUNameIdx(CFDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDelTopDepObj> readDelTopDepByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubDelTopDepObj readCachedDelTopDepByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByDelDepIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( CFDbKeyHash256 TableId );

	IBusModelPubDelTopDepObj readCachedDelTopDepByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDelTopDepObj> readCachedDelTopDepByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDelTopDepByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDelTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeDelTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDelTopDepByDelDepIdx( CFDbKeyHash256 RelationId );

	void deepDisposeDelTopDepByDelTopDepTblIdx( CFDbKeyHash256 TableId );

	void deepDisposeDelTopDepByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	void deepDisposeDelTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDelTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDelTopDepObj updateDelTopDep( IBusModelPubDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelTopDep( IBusModelPubDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelTopDepTblIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDelTopDepObj refreshed cache instance.
	 */
	IBusModelPubDelTopDepObj moveUpDelTopDep( IBusModelPubDelTopDepObj Obj );

	/**
	 *	Move the BusModelPubDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDelTopDepObj refreshed cache instance.
	 */
	IBusModelPubDelTopDepObj moveDownDelTopDep( IBusModelPubDelTopDepObj Obj );
}
