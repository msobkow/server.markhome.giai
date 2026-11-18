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

public interface IBusModelProtClearDepTableObj
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
	 *	Instantiate a new ClearDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtClearDepObj newInstance();

	/**
	 *	Instantiate a new ClearDep edition of the specified ClearDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtClearDepEditObj newEditInstance( IBusModelProtClearDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearDepObj realiseClearDep( IBusModelProtClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearDepObj createClearDep( IBusModelProtClearDepObj Obj );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtClearDepObj readClearDep( CFDbKeyHash256 pkey );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtClearDepObj readClearDep( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtClearDepObj readCachedClearDep( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeClearDep( IBusModelProtClearDepObj obj );

	void deepDisposeClearDep( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearDepObj lockClearDep( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtClearDepObj> readAllClearDep();

	/**
	 *	Return a sorted map of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtClearDepObj> readAllClearDep( boolean forceRead );

	List<IBusModelProtClearDepObj> readCachedAllClearDep();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearDepObj readClearDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearDepObj readClearDepByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtClearDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtClearDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtClearDepObj> instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearDepObj> cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of List<IBusModelProtClearDepObj> instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearDepObj> cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByClearDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtClearDepObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearDepObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtClearDepObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearDepObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearDepObj> readClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedClearDepByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedClearDepByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtClearDepObj>> readCachedClearDepByClearDepIdx( ICFKeyHash256 RelationId );

	List<List<IBusModelProtClearDepObj>> readCachedClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeClearDepByIdIdx( ICFKeyHash256 Id );

	void deepDisposeClearDepByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeClearDepByClearDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearDepObj updateClearDep( IBusModelProtClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearDep( IBusModelProtClearDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
