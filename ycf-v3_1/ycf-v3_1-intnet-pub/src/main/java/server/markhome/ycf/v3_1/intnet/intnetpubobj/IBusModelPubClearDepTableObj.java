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

public interface IBusModelPubClearDepTableObj
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
	 *	Instantiate a new ClearDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubClearDepObj newInstance();

	/**
	 *	Instantiate a new ClearDep edition of the specified ClearDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubClearDepEditObj newEditInstance( IBusModelPubClearDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearDepObj realiseClearDep( IBusModelPubClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearDepObj createClearDep( IBusModelPubClearDepObj Obj );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearDepObj readClearDep( ICFKeyHash256 pkey );

	/**
	 *	Read a ClearDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearDepObj readClearDep( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubClearDepObj readCachedClearDep( ICFKeyHash256 pkey );

	public void reallyDeepDisposeClearDep( IBusModelPubClearDepObj obj );

	void deepDisposeClearDep( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearDepObj lockClearDep( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearDepObj> readAllClearDep();

	/**
	 *	Return a sorted map of all the ClearDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearDepObj> readAllClearDep( boolean forceRead );

	List<IBusModelPubClearDepObj> readCachedAllClearDep();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearDepObj readClearDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearDepObj readClearDepByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByClearDepIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearDepObj> readClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelPubClearDepObj readCachedClearDepByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubClearDepObj> readCachedClearDepByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubClearDepObj> readCachedClearDepByClearDepIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubClearDepObj> readCachedClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeClearDepByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeClearDepByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeClearDepByClearDepIdx( CFDbKeyHash256 RelationId );

	void deepDisposeClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearDepObj updateClearDep( IBusModelPubClearDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearDep( IBusModelPubClearDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearDep key attribute of the instance generating the id.
	 */
	void deleteClearDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
