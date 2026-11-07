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

public interface IBusModelRelationTableObj
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
	 *	Instantiate a new Relation instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelRelationObj newInstance();

	/**
	 *	Instantiate a new Relation edition of the specified Relation instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelRelationEditObj newEditInstance( IBusModelRelationObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelRelationObj realiseRelation( IBusModelRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelRelationObj createRelation( IBusModelRelationObj Obj );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelRelationObj readRelation( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a Relation-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Relation-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelRelationObj readRelation( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelRelationObj readCachedRelation( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeRelation( IBusModelRelationObj obj );

	void deepDisposeRelation( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelRelationObj lockRelation( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IBusModelRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelRelationObj> readAllRelation();

	/**
	 *	Return a sorted map of all the Relation-derived instances in the database.
	 *
	 *	@return	List of IBusModelRelationObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelRelationObj> readAllRelation( boolean forceRead );

	List<IBusModelRelationObj> readCachedAllRelation();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelRelationObj readRelationByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelRelationObj readRelationByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the BusModelRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRelationObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRelationObj readRelationByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelRelationObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRelationObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRelationObj readRelationByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelTableIdx key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelTableCodeVisX key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelTableCodeVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelTableCodeVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate RelTableCodeVisX key.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate RelTableCodeVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByRelTableCodeVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByFromKeyIdx( ICFKeyHash256 FromIndexId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate FromKeyIdx key.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate FromKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByFromKeyIdx( ICFKeyHash256 FromIndexId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByToTblIdx( ICFKeyHash256 ToTableId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate ToTblIdx key.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate ToTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByToTblIdx( ICFKeyHash256 ToTableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByToKeyIdx( ICFKeyHash256 ToIndexId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate ToKeyIdx key.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate ToKeyIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByToKeyIdx( ICFKeyHash256 ToIndexId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByNarrowedIdx( ICFKeyHash256 NarrowedId );

	/**
	 *	Get the map of BusModelRelationObj instances sorted by their primary keys for the duplicate NarrowedIdx key.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRelationObj cached instances sorted by their primary keys for the duplicate NarrowedIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRelationObj> readRelationByNarrowedIdx( ICFKeyHash256 NarrowedId,
		boolean forceRead );

	IBusModelRelationObj readCachedRelationByIdIdx( ICFKeyHash256 Id );

	List<IBusModelRelationObj> readCachedRelationByTenantIdx( ICFKeyHash256 TenantId );

	IBusModelRelationObj readCachedRelationByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<IBusModelRelationObj> readCachedRelationByRelTableIdx( ICFKeyHash256 TableId );

	List<IBusModelRelationObj> readCachedRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelRelationObj> readCachedRelationByRelTableCodeVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelRelationObj> readCachedRelationByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelRelationObj> readCachedRelationByFromKeyIdx( ICFKeyHash256 FromIndexId );

	List<IBusModelRelationObj> readCachedRelationByToTblIdx( ICFKeyHash256 ToTableId );

	List<IBusModelRelationObj> readCachedRelationByToKeyIdx( ICFKeyHash256 ToIndexId );

	List<IBusModelRelationObj> readCachedRelationByNarrowedIdx( ICFKeyHash256 NarrowedId );

	void deepDisposeRelationByIdIdx( ICFKeyHash256 Id );

	void deepDisposeRelationByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeRelationByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeRelationByRelTableIdx( ICFKeyHash256 TableId );

	void deepDisposeRelationByRelCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByRelTableCodeVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeRelationByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeRelationByFromKeyIdx( ICFKeyHash256 FromIndexId );

	void deepDisposeRelationByToTblIdx( ICFKeyHash256 ToTableId );

	void deepDisposeRelationByToKeyIdx( ICFKeyHash256 ToIndexId );

	void deepDisposeRelationByNarrowedIdx( ICFKeyHash256 NarrowedId );

	/**
	 *	Internal use only.
	 */
	IBusModelRelationObj updateRelation( IBusModelRelationObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRelation( IBusModelRelationObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByRelTableIdx( ICFKeyHash256 TableId );

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
	void deleteRelationByRelTableCodeVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	FromIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByFromKeyIdx( ICFKeyHash256 FromIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToTableId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToTblIdx( ICFKeyHash256 ToTableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ToIndexId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByToKeyIdx( ICFKeyHash256 ToIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NarrowedId	The Relation key attribute of the instance generating the id.
	 */
	void deleteRelationByNarrowedIdx( ICFKeyHash256 NarrowedId );
}
