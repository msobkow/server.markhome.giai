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

public interface IBusModelProtClearTopDepTableObj
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
	 *	Instantiate a new ClearTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtClearTopDepObj newInstance();

	/**
	 *	Instantiate a new ClearTopDep edition of the specified ClearTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtClearTopDepEditObj newEditInstance( IBusModelProtClearTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearTopDepObj realiseClearTopDep( IBusModelProtClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearTopDepObj createClearTopDep( IBusModelProtClearTopDepObj Obj );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDep( CFDbKeyHash256 pkey );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDep( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtClearTopDepObj readCachedClearTopDep( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeClearTopDep( IBusModelProtClearTopDepObj obj );

	void deepDisposeClearTopDep( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearTopDepObj lockClearTopDep( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readAllClearTopDep();

	/**
	 *	Return a sorted map of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readAllClearTopDep( boolean forceRead );

	List<IBusModelProtClearTopDepObj> readCachedAllClearTopDep();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDepByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByClearDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtClearTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtClearTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the IBusModelProtClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtClearTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtClearTopDepObj readClearTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of List<IBusModelProtClearTopDepObj> instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtClearTopDepObj> cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtClearTopDepObj> readClearTopDepByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedClearTopDepByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtClearDepObj>> readCachedClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	List<List<IBusModelProtClearDepObj>> readCachedClearTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtClearTopDepObj>> readCachedClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	IBusModelProtClearTopDepObj readCachedClearTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<List<IBusModelProtClearTopDepObj>> readCachedClearTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtClearTopDepObj>> readCachedClearTopDepByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeClearTopDepByIdIdx( ICFKeyHash256 Id );

	void deepDisposeClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeClearTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	void deepDisposeClearTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeClearTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeClearTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtClearTopDepObj updateClearTopDep( IBusModelProtClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearTopDep( IBusModelProtClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtClearTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtClearTopDepObj refreshed cache instance.
	 */
	IBusModelProtClearTopDepObj moveUpClearTopDep( IBusModelProtClearTopDepObj Obj );

	/**
	 *	Move the IBusModelProtClearTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtClearTopDepObj refreshed cache instance.
	 */
	IBusModelProtClearTopDepObj moveDownClearTopDep( IBusModelProtClearTopDepObj Obj );
}
