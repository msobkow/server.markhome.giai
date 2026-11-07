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

public interface IBusModelProtServerListFuncTableObj
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
	 *	Instantiate a new ServerListFunc instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtServerListFuncObj newInstance();

	/**
	 *	Instantiate a new ServerListFunc edition of the specified ServerListFunc instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtServerListFuncEditObj newEditInstance( IBusModelProtServerListFuncObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerListFuncObj realiseServerListFunc( IBusModelProtServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerListFuncObj createServerListFunc( IBusModelProtServerListFuncObj Obj );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtServerListFuncObj readServerListFunc( CFDbKeyHash256 pkey );

	/**
	 *	Read a ServerListFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerListFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtServerListFuncObj readServerListFunc( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtServerListFuncObj readCachedServerListFunc( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeServerListFunc( IBusModelProtServerListFuncObj obj );

	void deepDisposeServerListFunc( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerListFuncObj lockServerListFunc( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readAllServerListFunc();

	/**
	 *	Return a sorted map of all the ServerListFunc-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readAllServerListFunc( boolean forceRead );

	List<IBusModelProtServerListFuncObj> readCachedAllServerListFunc();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerListFuncObj readServerListFuncByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerListFuncObj readServerListFuncByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerListFuncObj readServerListFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the IBusModelProtServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerListFuncObj readServerListFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtServerListFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerListFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtServerListFuncObj> instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	RetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtServerListFuncObj> cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	/**
	 *	Get the map of List<IBusModelProtServerListFuncObj> instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	RetTableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtServerListFuncObj> cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerListFuncObj> readServerListFuncByRetTblIdx( CFDbKeyHash256 RetTableId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedServerListFuncByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedServerListFuncByTenantIdx( ICFKeyHash256 TenantId );

	IBusModelProtServerMethodObj readCachedServerListFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<List<IBusModelProtServerMethodObj>> readCachedServerListFuncByMethTableIdx( ICFKeyHash256 TableId );

	List<List<IBusModelProtServerMethodObj>> readCachedServerListFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtServerMethodObj>> readCachedServerListFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtServerMethodObj>> readCachedServerListFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtServerListFuncObj>> readCachedServerListFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	void deepDisposeServerListFuncByIdIdx( ICFKeyHash256 Id );

	void deepDisposeServerListFuncByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeServerListFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeServerListFuncByMethTableIdx( ICFKeyHash256 TableId );

	void deepDisposeServerListFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerListFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeServerListFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerListFuncObj updateServerListFunc( IBusModelProtServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerListFunc( IBusModelProtServerListFuncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerListFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RetTableId	The ServerListFunc key attribute of the instance generating the id.
	 */
	void deleteServerListFuncByRetTblIdx( CFDbKeyHash256 RetTableId );
}
