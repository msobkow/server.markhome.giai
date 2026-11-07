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

public interface IBusModelProtTableTableObj
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
	 *	Instantiate a new Table instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTableObj newInstance();

	/**
	 *	Instantiate a new Table edition of the specified Table instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTableEditObj newEditInstance( IBusModelProtTableObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableObj realiseTable( IBusModelProtTableObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableObj createTable( IBusModelProtTableObj Obj );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableObj readTable( CFDbKeyHash256 pkey );

	/**
	 *	Read a Table-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Table-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableObj readTable( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTableObj readCachedTable( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTable( IBusModelProtTableObj obj );

	void deepDisposeTable( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableObj lockTable( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Table-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableObj> readAllTable();

	/**
	 *	Return a sorted map of all the Table-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableObj> readAllTable( boolean forceRead );

	List<IBusModelProtTableObj> readCachedAllTable();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtTableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableBySchemaDefIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate SchemaDefIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate SchemaDefIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableBySchemaDefIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate CodeVisIdx key.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate CodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableBySchemaCodeVisIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate SchemaCodeVisIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableBySchemaCodeVisIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTableObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableByUNameIdx(ICFKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Get the IBusModelProtTableObj instance for the unique UNameIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTableObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableByUNameIdx(ICFKeyHash256 SchemaDefId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTableObj cached instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableBySchemaCdIdx(ICFKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Get the IBusModelProtTableObj instance for the unique SchemaCdIdx key.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTableObj refreshed instance for the unique SchemaCdIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableObj readTableBySchemaCdIdx(ICFKeyHash256 SchemaDefId,
		String TableClassCode,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByPrimaryIndexIdx( CFDbKeyHash256 PrimaryIndexId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate PrimaryIndexIdx key.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate PrimaryIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByPrimaryIndexIdx( CFDbKeyHash256 PrimaryIndexId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByLookupIndexIdx( CFDbKeyHash256 LookupIndexId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate LookupIndexIdx key.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate LookupIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByLookupIndexIdx( CFDbKeyHash256 LookupIndexId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByAltIndexIdx( CFDbKeyHash256 AltIndexId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate AltIndexIdx key.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate AltIndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByAltIndexIdx( CFDbKeyHash256 AltIndexId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByQualTableIdx( CFDbKeyHash256 QualifyingTableId );

	/**
	 *	Get the map of List<IBusModelProtTableObj> instances sorted by their primary keys for the duplicate QualTableIdx key.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableObj> cached instances sorted by their primary keys for the duplicate QualTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableObj> readTableByQualTableIdx( CFDbKeyHash256 QualifyingTableId,
		boolean forceRead );

	IBusModelProtScopeObj readCachedTableByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedTableByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtTableObj>> readCachedTableBySchemaDefIdx( ICFKeyHash256 SchemaDefId );

	List<List<IBusModelProtTableObj>> readCachedTableByCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtTableObj>> readCachedTableBySchemaCodeVisIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	List<List<IBusModelProtTableObj>> readCachedTableByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtTableObj readCachedTableByUNameIdx( ICFKeyHash256 SchemaDefId,
		String Name );

	IBusModelProtTableObj readCachedTableBySchemaCdIdx( ICFKeyHash256 SchemaDefId,
		String TableClassCode );

	List<List<IBusModelProtTableObj>> readCachedTableByPrimaryIndexIdx( CFDbKeyHash256 PrimaryIndexId );

	List<List<IBusModelProtTableObj>> readCachedTableByLookupIndexIdx( CFDbKeyHash256 LookupIndexId );

	List<List<IBusModelProtTableObj>> readCachedTableByAltIndexIdx( CFDbKeyHash256 AltIndexId );

	List<List<IBusModelProtTableObj>> readCachedTableByQualTableIdx( CFDbKeyHash256 QualifyingTableId );

	void deepDisposeTableByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTableByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeTableBySchemaDefIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTableByCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableBySchemaCodeVisIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	void deepDisposeTableByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTableByUNameIdx( ICFKeyHash256 SchemaDefId,
		String Name );

	void deepDisposeTableBySchemaCdIdx( ICFKeyHash256 SchemaDefId,
		String TableClassCode );

	void deepDisposeTableByPrimaryIndexIdx( CFDbKeyHash256 PrimaryIndexId );

	void deepDisposeTableByLookupIndexIdx( CFDbKeyHash256 LookupIndexId );

	void deepDisposeTableByAltIndexIdx( CFDbKeyHash256 AltIndexId );

	void deepDisposeTableByQualTableIdx( CFDbKeyHash256 QualifyingTableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableObj updateTable( IBusModelProtTableObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTable( IBusModelProtTableObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaDefIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByCodeVisIdx( IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCodeVisIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByUNameIdx(ICFKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 */
	void deleteTableBySchemaCdIdx(ICFKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByPrimaryIndexIdx( CFDbKeyHash256 PrimaryIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByLookupIndexIdx( CFDbKeyHash256 LookupIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByAltIndexIdx( CFDbKeyHash256 AltIndexId );

	/**
	 *	Internal use only.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 */
	void deleteTableByQualTableIdx( CFDbKeyHash256 QualifyingTableId );
}
