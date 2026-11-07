// Description: Java 25 Table Object interface for BusModel.

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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelClearTopDepTableObj
{
	public IBusModelSchemaObj getSchema();
	public void setSchema( IBusModelSchemaObj value );

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
	IBusModelClearTopDepObj newInstance();

	/**
	 *	Instantiate a new ClearTopDep edition of the specified ClearTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelClearTopDepEditObj newEditInstance( IBusModelClearTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelClearTopDepObj realiseClearTopDep( IBusModelClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelClearTopDepObj createClearTopDep( IBusModelClearTopDepObj Obj );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelClearTopDepObj readClearTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a ClearTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelClearTopDepObj readClearTopDep( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelClearTopDepObj readCachedClearTopDep( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeClearTopDep( IBusModelClearTopDepObj obj );

	void deepDisposeClearTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelClearTopDepObj lockClearTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelClearTopDepObj> readAllClearTopDep();

	/**
	 *	Return a sorted map of all the ClearTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelClearTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelClearTopDepObj> readAllClearTopDep( boolean forceRead );

	List<IBusModelClearTopDepObj> readCachedAllClearTopDep();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearTopDepObj readClearTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearTopDepObj readClearTopDepByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByClearDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate ClrTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the BusModelClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelClearTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearTopDepObj readClearTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelClearTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelClearTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearTopDepObj readClearTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelClearTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearTopDepObj> readClearTopDepByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelClearTopDepObj readCachedClearTopDepByIdIdx( ICFKeyHash256 Id );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	IBusModelClearTopDepObj readCachedClearTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelClearTopDepObj> readCachedClearTopDepByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeClearTopDepByIdIdx( ICFKeyHash256 Id );

	void deepDisposeClearTopDepByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeClearTopDepByClearDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeClearTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeClearTopDepByClrTopDepTblIdx( ICFKeyHash256 TableId );

	void deepDisposeClearTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeClearTopDepByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeClearTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelClearTopDepObj updateClearTopDep( IBusModelClearTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearTopDep( IBusModelClearTopDepObj Obj );

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
	void deleteClearTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

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
	void deleteClearTopDepByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The ClearTopDep key attribute of the instance generating the id.
	 */
	void deleteClearTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelClearTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelClearTopDepObj refreshed cache instance.
	 */
	IBusModelClearTopDepObj moveUpClearTopDep( IBusModelClearTopDepObj Obj );

	/**
	 *	Move the BusModelClearTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelClearTopDepObj refreshed cache instance.
	 */
	IBusModelClearTopDepObj moveDownClearTopDep( IBusModelClearTopDepObj Obj );
}
