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

public interface IBusModelPubClearSubDep2TableObj
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
	 *	Instantiate a new ClearSubDep2 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubClearSubDep2Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep2 edition of the specified ClearSubDep2 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubClearSubDep2EditObj newEditInstance( IBusModelPubClearSubDep2Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep2Obj realiseClearSubDep2( IBusModelPubClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep2Obj createClearSubDep2( IBusModelPubClearSubDep2Obj Obj );

	/**
	 *	Read a ClearSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2( ICFKeyHash256 pkey );

	/**
	 *	Read a ClearSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubClearSubDep2Obj readCachedClearSubDep2( ICFKeyHash256 pkey );

	public void reallyDeepDisposeClearSubDep2( IBusModelPubClearSubDep2Obj obj );

	void deepDisposeClearSubDep2( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep2Obj lockClearSubDep2( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep2-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readAllClearSubDep2();

	/**
	 *	Return a sorted map of all the ClearSubDep2-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubClearSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readAllClearSubDep2( boolean forceRead );

	List<IBusModelPubClearSubDep2Obj> readCachedAllClearSubDep2();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2ByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2ByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubClearSubDep2Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByClearDepIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubClearSubDep2Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearSubDep1Idx key.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( CFDbKeyHash256 ClearSubDep1Id );

	/**
	 *	Get the map of BusModelPubClearSubDep2Obj instances sorted by their primary keys for the duplicate ClearSubDep1Idx key.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubClearSubDep2Obj cached instances sorted by their primary keys for the duplicate ClearSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubClearSubDep2Obj> readClearSubDep2ByClearSubDep1Idx( CFDbKeyHash256 ClearSubDep1Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubClearSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubClearSubDep2Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2ByUNameIdx(CFDbKeyHash256 ClearSubDep1Id,
		String Name );

	/**
	 *	Get the BusModelPubClearSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubClearSubDep2Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubClearSubDep2Obj readClearSubDep2ByUNameIdx(CFDbKeyHash256 ClearSubDep1Id,
		String Name,
		boolean forceRead );

	IBusModelPubClearSubDep2Obj readCachedClearSubDep2ByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubClearSubDep2Obj> readCachedClearSubDep2ByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubClearSubDep2Obj> readCachedClearSubDep2ByClearDepIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubClearSubDep2Obj> readCachedClearSubDep2ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubClearSubDep2Obj> readCachedClearSubDep2ByClearSubDep1Idx( CFDbKeyHash256 ClearSubDep1Id );

	IBusModelPubClearSubDep2Obj readCachedClearSubDep2ByUNameIdx( CFDbKeyHash256 ClearSubDep1Id,
		String Name );

	void deepDisposeClearSubDep2ByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeClearSubDep2ByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeClearSubDep2ByClearDepIdx( CFDbKeyHash256 RelationId );

	void deepDisposeClearSubDep2ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeClearSubDep2ByClearSubDep1Idx( CFDbKeyHash256 ClearSubDep1Id );

	void deepDisposeClearSubDep2ByUNameIdx( CFDbKeyHash256 ClearSubDep1Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPubClearSubDep2Obj updateClearSubDep2( IBusModelPubClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep2( IBusModelPubClearSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByClearDepIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByClearSubDep1Idx( CFDbKeyHash256 ClearSubDep1Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearSubDep1Id	The ClearSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep2 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep2ByUNameIdx(CFDbKeyHash256 ClearSubDep1Id,
		String Name );
}
