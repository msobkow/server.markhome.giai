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

public interface IBusModelPubClearSubDep1TableObj
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
	 *	Instantiate a new ClearSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubClearSubDep1Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep1 edition of the specified ClearSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubClearSubDep1EditObj newEditInstance( IBusModelPubClearSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep1Obj realiseClearSubDep1( IBusModelPubClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep1Obj createClearSubDep1( IBusModelPubClearSubDep1Obj Obj );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1( ICFKeyHash256 pkey );

	/**
	 *	Read a ClearSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubClearSubDep1Obj readCachedClearSubDep1( ICFKeyHash256 pkey );

	public void reallyDeepDisposeClearSubDep1( IBusModelPubClearSubDep1Obj obj );

	void deepDisposeClearSubDep1( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep1Obj lockClearSubDep1( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readAllClearSubDep1();

	/**
	 *	Return a sorted map of all the ClearSubDep1-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readAllClearSubDep1( boolean forceRead );

	List<IBusModelPubClearSubDep1Obj> readCachedAllClearSubDep1();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1ByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1ByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubClearSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByClearDepIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubClearSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( CFDbKeyHash256 ClearTopDepId );

	/**
	 *	Get the map of BusModelPubClearSubDep1Obj instances sorted by their primary keys for the duplicate ClearTopDepIdx key.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep1Obj cached instances sorted by their primary keys for the duplicate ClearTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep1Obj> readClearSubDep1ByClearTopDepIdx( CFDbKeyHash256 ClearTopDepId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubClearSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1ByUNameIdx(CFDbKeyHash256 ClearTopDepId,
		String Name );

	/**
	 *	Get the BusModelPubClearSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubClearSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep1Obj readClearSubDep1ByUNameIdx(CFDbKeyHash256 ClearTopDepId,
		String Name,
		boolean forceRead );

	IBusModelPubClearSubDep1Obj readCachedClearSubDep1ByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubClearSubDep1Obj> readCachedClearSubDep1ByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubClearSubDep1Obj> readCachedClearSubDep1ByClearDepIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubClearSubDep1Obj> readCachedClearSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubClearSubDep1Obj> readCachedClearSubDep1ByClearTopDepIdx( CFDbKeyHash256 ClearTopDepId );

	IBusModelPubClearSubDep1Obj readCachedClearSubDep1ByUNameIdx( CFDbKeyHash256 ClearTopDepId,
		String Name );

	void deepDisposeClearSubDep1ByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeClearSubDep1ByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeClearSubDep1ByClearDepIdx( CFDbKeyHash256 RelationId );

	void deepDisposeClearSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeClearSubDep1ByClearTopDepIdx( CFDbKeyHash256 ClearTopDepId );

	void deepDisposeClearSubDep1ByUNameIdx( CFDbKeyHash256 ClearTopDepId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep1Obj updateClearSubDep1( IBusModelPubClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep1( IBusModelPubClearSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByClearTopDepIdx( CFDbKeyHash256 ClearTopDepId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearTopDepId	The ClearSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep1 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep1ByUNameIdx(CFDbKeyHash256 ClearTopDepId,
		String Name );
}
