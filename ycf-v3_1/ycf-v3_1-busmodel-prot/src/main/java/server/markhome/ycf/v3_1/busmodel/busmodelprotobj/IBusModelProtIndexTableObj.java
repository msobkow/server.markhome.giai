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

public interface IBusModelProtIndexTableObj
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
	 *	Instantiate a new Index instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtIndexObj newInstance();

	/**
	 *	Instantiate a new Index edition of the specified Index instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtIndexEditObj newEditInstance( IBusModelProtIndexObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexObj realiseIndex( IBusModelProtIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexObj createIndex( IBusModelProtIndexObj Obj );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexObj readIndex( CFDbKeyHash256 pkey );

	/**
	 *	Read a Index-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Index-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexObj readIndex( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtIndexObj readCachedIndex( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeIndex( IBusModelProtIndexObj obj );

	void deepDisposeIndex( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexObj lockIndex( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Index-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexObj> readAllIndex();

	/**
	 *	Return a sorted map of all the Index-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexObj> readAllIndex( boolean forceRead );

	List<IBusModelProtIndexObj> readCachedAllIndex();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexObj readIndexByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexObj readIndexByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtIndexObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexObj readIndexByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the IBusModelProtIndexObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtIndexObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexObj readIndexByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxTableIdx key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxCodeVisIdx key.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxTblCdVisX key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxTblCdVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxTblCdVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate IdxTblCdVisX key.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate IdxTblCdVisX key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByIdxTblCdVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtIndexObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexObj> readIndexByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedIndexByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedIndexByTenantIdx( ICFKeyHash256 TenantId );

	IBusModelProtIndexObj readCachedIndexByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<List<IBusModelProtIndexObj>> readCachedIndexByIdxTableIdx( ICFKeyHash256 TableId );

	List<List<IBusModelProtIndexObj>> readCachedIndexByIdxCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtIndexObj>> readCachedIndexByIdxTblCdVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtIndexObj>> readCachedIndexByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeIndexByIdIdx( ICFKeyHash256 Id );

	void deepDisposeIndexByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeIndexByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeIndexByIdxTableIdx( ICFKeyHash256 TableId );

	void deepDisposeIndexByIdxCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByIdxTblCdVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeIndexByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexObj updateIndex( IBusModelProtIndexObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndex( IBusModelProtIndexObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Index key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByIdxTblCdVisX( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Index key attribute of the instance generating the id.
	 */
	void deleteIndexByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
