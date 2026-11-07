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

public interface IBusModelPubServerProcTableObj
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
	 *	Instantiate a new ServerProc instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubServerProcObj newInstance();

	/**
	 *	Instantiate a new ServerProc edition of the specified ServerProc instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubServerProcEditObj newEditInstance( IBusModelPubServerProcObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerProcObj realiseServerProc( IBusModelPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerProcObj createServerProc( IBusModelPubServerProcObj Obj );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubServerProcObj readServerProc( ICFKeyHash256 pkey );

	/**
	 *	Read a ServerProc-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ServerProc-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubServerProcObj readServerProc( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubServerProcObj readCachedServerProc( ICFKeyHash256 pkey );

	public void reallyDeepDisposeServerProc( IBusModelPubServerProcObj obj );

	void deepDisposeServerProc( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerProcObj lockServerProc( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubServerProcObj> readAllServerProc();

	/**
	 *	Return a sorted map of all the ServerProc-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubServerProcObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubServerProcObj> readAllServerProc( boolean forceRead );

	List<IBusModelPubServerProcObj> readCachedAllServerProc();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerProcObj readServerProcByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerProcObj readServerProcByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubServerProcObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubServerMethodObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerProcObj readServerProcByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelPubServerMethodObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubServerMethodObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubServerProcObj readServerProcByUNameIdx( CFDbKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubServerProcObj instances sorted by their primary keys for the duplicate MethTableIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubServerProcObj instances sorted by their primary keys for the duplicate MethCodeVisIdx key.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of BusModelPubServerProcObj instances sorted by their primary keys for the duplicate MethTableVisIdx key.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate MethTableVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubServerMethodObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubServerProcObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubServerProcObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubServerProcObj> readServerProcByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelPubServerProcObj readCachedServerProcByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubServerProcObj> readCachedServerProcByTenantIdx( CFDbKeyHash256 TenantId );

	IBusModelPubServerProcObj readCachedServerProcByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	List<IBusModelPubServerProcObj> readCachedServerProcByMethTableIdx( CFDbKeyHash256 TableId );

	List<IBusModelPubServerProcObj> readCachedServerProcByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubServerProcObj> readCachedServerProcByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<IBusModelPubServerProcObj> readCachedServerProcByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeServerProcByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeServerProcByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeServerProcByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	void deepDisposeServerProcByMethTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeServerProcByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeServerProcByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubServerProcObj updateServerProc( IBusModelPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteServerProc( IBusModelPubServerProcObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByUNameIdx( CFDbKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ServerProc key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByMethTableVisIdx( CFDbKeyHash256 TableId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ServerProc key attribute of the instance generating the id.
	 */
	void deleteServerProcByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
