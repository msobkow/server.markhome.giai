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

public interface IBusModelPubServerMethodTableObj
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
	 *	Instantiate a new ServerMethod instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubServerMethodObj newInstance();

	/**
	 *	Instantiate a new ServerMethod edition of the specified ServerMethod instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubServerMethodEditObj newEditInstance( IBusModelPubServerMethodObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerMethodObj realiseServerMethod( IBusModelPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerMethodObj createServerMethod( IBusModelPubServerMethodObj Obj );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubServerMethodObj readServerMethod( ICFKeyHash256 pkey );

	/**
	 *	Read a ServerMethod-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerMethod-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubServerMethodObj readServerMethod( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubServerMethodObj readCachedServerMethod( ICFKeyHash256 pkey );

	public void reallyDeepDisposeServerMethod( IBusModelPubServerMethodObj obj );

	void deepDisposeServerMethod( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerMethodObj lockServerMethod( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubServerMethodObj> readAllServerMethod();

	/**
	 *	Return a sorted map of all the ServerMethod-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubServerMethodObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubServerMethodObj> readAllServerMethod( boolean forceRead );

	List<IBusModelPubServerMethodObj> readCachedAllServerMethod();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerMethodObj readServerMethodByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerMethodObj readServerMethodByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerMethodObj readServerMethodByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerMethodObj readServerMethodByUNameIdx(CFDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerMethodObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerMethodObj> readServerMethodByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelPubServerMethodObj readCachedServerMethodByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubServerMethodObj> readCachedServerMethodByTenantIdx( CFDbKeyHash256 TenantId );

	IBusModelPubServerMethodObj readCachedServerMethodByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	List<IBusModelPubServerMethodObj> readCachedServerMethodByMethTableIdx( CFDbKeyHash256 TableId );

	List<IBusModelPubServerMethodObj> readCachedServerMethodByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubServerMethodObj> readCachedServerMethodByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubServerMethodObj> readCachedServerMethodByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeServerMethodByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeServerMethodByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeServerMethodByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	void deepDisposeServerMethodByMethTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeServerMethodByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerMethodByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerMethodObj updateServerMethod( IBusModelPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerMethod( IBusModelPubServerMethodObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByUNameIdx(CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerMethod key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerMethod key attribute of the instance generating the id.
	 */
	void deleteServerMethodByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
