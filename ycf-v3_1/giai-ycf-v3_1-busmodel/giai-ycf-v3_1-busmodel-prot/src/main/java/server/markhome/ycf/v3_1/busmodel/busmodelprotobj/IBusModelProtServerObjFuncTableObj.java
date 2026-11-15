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

public interface IBusModelProtServerObjFuncTableObj
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
	 *	Instantiate a new ServerObjFunc instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtServerObjFuncObj newInstance();

	/**
	 *	Instantiate a new ServerObjFunc edition of the specified ServerObjFunc instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtServerObjFuncEditObj newEditInstance( IBusModelProtServerObjFuncObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerObjFuncObj realiseServerObjFunc( IBusModelProtServerObjFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerObjFuncObj createServerObjFunc( IBusModelProtServerObjFuncObj Obj );

	/**
	 *	Read a ServerObjFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerObjFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFunc( CFDbKeyHash256 pkey );

	/**
	 *	Read a ServerObjFunc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerObjFunc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFunc( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtServerObjFuncObj readCachedServerObjFunc( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeServerObjFunc( IBusModelProtServerObjFuncObj obj );

	void deepDisposeServerObjFunc( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerObjFuncObj lockServerObjFunc( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerObjFunc-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readAllServerObjFunc();

	/**
	 *	Return a sorted map of all the ServerObjFunc-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readAllServerObjFunc( boolean forceRead );

	List<IBusModelProtServerObjFuncObj> readCachedAllServerObjFunc();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFuncByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFuncByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the IBusModelProtServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtServerObjFuncObj readServerObjFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtServerObjFuncObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtServerObjFuncObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtServerObjFuncObj> instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	RetTableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtServerObjFuncObj> cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	/**
	 *	Get the map of List<IBusModelProtServerObjFuncObj> instances sorted by their primary keys for the duplicate RetTblIdx key.
	 *
	 *	@param	RetTableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtServerObjFuncObj> cached instances sorted by their primary keys for the duplicate RetTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtServerObjFuncObj> readServerObjFuncByRetTblIdx( CFDbKeyHash256 RetTableId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedServerObjFuncByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedServerObjFuncByTenantIdx( ICFKeyHash256 TenantId );

	IBusModelProtServerMethodObj readCachedServerObjFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<List<IBusModelProtServerMethodObj>> readCachedServerObjFuncByMethTableIdx( ICFKeyHash256 TableId );

	List<List<IBusModelProtServerMethodObj>> readCachedServerObjFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtServerMethodObj>> readCachedServerObjFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtServerMethodObj>> readCachedServerObjFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtServerObjFuncObj>> readCachedServerObjFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	void deepDisposeServerObjFuncByIdIdx( ICFKeyHash256 Id );

	void deepDisposeServerObjFuncByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeServerObjFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeServerObjFuncByMethTableIdx( ICFKeyHash256 TableId );

	void deepDisposeServerObjFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerObjFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerObjFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeServerObjFuncByRetTblIdx( CFDbKeyHash256 RetTableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtServerObjFuncObj updateServerObjFunc( IBusModelProtServerObjFuncObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerObjFunc( IBusModelProtServerObjFuncObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByMethTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerObjFunc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByMethTableVisIdx( ICFKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RetTableId	The ServerObjFunc key attribute of the instance generating the id.
	 */
	void deleteServerObjFuncByRetTblIdx( CFDbKeyHash256 RetTableId );
}
