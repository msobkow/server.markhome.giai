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

public interface IBusModelPubRelationTableObj
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
	 *	Instantiate a new Relation instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubRelationObj newInstance();

	/**
	 *	Instantiate a new Relation edition of the specified Relation instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubRelationEditObj newEditInstance( IBusModelPubRelationObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationObj realiseRelation( IBusModelPubRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationObj createRelation( IBusModelPubRelationObj Obj );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubRelationObj readRelation( ICFKeyHash256 pkey );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubRelationObj readRelation( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubRelationObj readCachedRelation( ICFKeyHash256 pkey );

	public void reallyDeepDisposeRelation( IBusModelPubRelationObj obj );

	void deepDisposeRelation( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationObj lockRelation( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubRelationObj> readAllRelation();

	/**
	 *	Return a sorted map of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubRelationObj> readAllRelation( boolean forceRead );

	List<IBusModelPubRelationObj> readCachedAllRelation();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationObj readRelationByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationObj readRelationByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationObj readRelationByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelPubRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRelationObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubRelationObj readRelationByUNameIdx(CFDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelTableCodeVisX key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelTableCodeVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelTableCodeVisX( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate RelTableCodeVisX key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate RelTableCodeVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByRelTableCodeVisX( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByFromKeyIdx( CFDbKeyHash256 FromIndexId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByFromKeyIdx( CFDbKeyHash256 FromIndexId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByToTblIdx( CFDbKeyHash256 ToTableId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByToTblIdx( CFDbKeyHash256 ToTableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByToKeyIdx( CFDbKeyHash256 ToIndexId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByToKeyIdx( CFDbKeyHash256 ToIndexId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByNarrowedIdx( CFDbKeyHash256 NarrowedId );

	/**
	 *	Get the map of BusModelPubRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubRelationObj> readRelationByNarrowedIdx( CFDbKeyHash256 NarrowedId,
		boolean forceRead );

	IBusModelPubRelationObj readCachedRelationByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubRelationObj> readCachedRelationByTenantIdx( CFDbKeyHash256 TenantId );

	IBusModelPubRelationObj readCachedRelationByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	List<IBusModelPubRelationObj> readCachedRelationByRelTableIdx( CFDbKeyHash256 TableId );

	List<IBusModelPubRelationObj> readCachedRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubRelationObj> readCachedRelationByRelTableCodeVisX( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubRelationObj> readCachedRelationByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubRelationObj> readCachedRelationByFromKeyIdx( CFDbKeyHash256 FromIndexId );

	List<IBusModelPubRelationObj> readCachedRelationByToTblIdx( CFDbKeyHash256 ToTableId );

	List<IBusModelPubRelationObj> readCachedRelationByToKeyIdx( CFDbKeyHash256 ToIndexId );

	List<IBusModelPubRelationObj> readCachedRelationByNarrowedIdx( CFDbKeyHash256 NarrowedId );

	void deepDisposeRelationByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeRelationByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeRelationByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	void deepDisposeRelationByRelTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByRelTableCodeVisX( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeRelationByFromKeyIdx( CFDbKeyHash256 FromIndexId );

	void deepDisposeRelationByToTblIdx( CFDbKeyHash256 ToTableId );

	void deepDisposeRelationByToKeyIdx( CFDbKeyHash256 ToIndexId );

	void deepDisposeRelationByNarrowedIdx( CFDbKeyHash256 NarrowedId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubRelationObj updateRelation( IBusModelPubRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelation( IBusModelPubRelationObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableCodeVisX( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByFromKeyIdx( CFDbKeyHash256 FromIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToTblIdx( CFDbKeyHash256 ToTableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToKeyIdx( CFDbKeyHash256 ToIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByNarrowedIdx( CFDbKeyHash256 NarrowedId );
}
