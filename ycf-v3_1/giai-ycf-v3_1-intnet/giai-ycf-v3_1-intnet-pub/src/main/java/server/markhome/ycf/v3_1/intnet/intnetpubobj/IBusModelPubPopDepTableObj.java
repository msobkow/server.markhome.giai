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

public interface IBusModelPubPopDepTableObj
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
	 *	Instantiate a new PopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubPopDepObj newInstance();

	/**
	 *	Instantiate a new PopDep edition of the specified PopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubPopDepEditObj newEditInstance( IBusModelPubPopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopDepObj realisePopDep( IBusModelPubPopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopDepObj createPopDep( IBusModelPubPopDepObj Obj );

	/**
	 *	Read a PopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubPopDepObj readPopDep( ICFKeyHash256 pkey );

	/**
	 *	Read a PopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubPopDepObj readPopDep( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubPopDepObj readCachedPopDep( ICFKeyHash256 pkey );

	public void reallyDeepDisposePopDep( IBusModelPubPopDepObj obj );

	void deepDisposePopDep( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopDepObj lockPopDep( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the PopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubPopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubPopDepObj> readAllPopDep();

	/**
	 *	Return a sorted map of all the PopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubPopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubPopDepObj> readAllPopDep( boolean forceRead );

	List<IBusModelPubPopDepObj> readCachedAllPopDep();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopDepObj readPopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopDepObj readPopDepByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByRelationIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByRelationIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopDepObj> readPopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	IBusModelPubPopDepObj readCachedPopDepByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubPopDepObj> readCachedPopDepByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubPopDepObj> readCachedPopDepByRelationIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubPopDepObj> readCachedPopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposePopDepByIdIdx( CFDbKeyHash256 Id );

	void deepDisposePopDepByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposePopDepByRelationIdx( CFDbKeyHash256 RelationId );

	void deepDisposePopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopDepObj updatePopDep( IBusModelPubPopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopDep( IBusModelPubPopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByRelationIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopDep key attribute of the instance generating the id.
	 */
	void deletePopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );
}
