// Description: Java 25 Protected Table Object interface for SecureProt.

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

package server.markhome.ycf.v3_1.secure.secureprotobj;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.secureprot.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;

public interface ISecureProtTableInfoTableObj
{
	public ISecureProtSchemaObj getSchema();
	public void setSchema( ISecureProtSchemaObj value );

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
	 *	Instantiate a new TableInfo instance.
	 *
	 *	@return	A new instance.
	 */
	ISecureProtTableInfoObj newInstance();

	/**
	 *	Instantiate a new TableInfo edition of the specified TableInfo instance.
	 *
	 *	@return	A new edition.
	 */
	ISecureProtTableInfoEditObj newEditInstance( ISecureProtTableInfoObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecureProtTableInfoEditObj instance, which may be a subclass of a TableInfo instance.
	 */
	ISecureProtTableInfoObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtTableInfoObj realiseTableInfo( ISecureProtTableInfoObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecureProtTableInfoObj createTableInfo( ISecureProtTableInfoObj Obj );

	/**
	 *	Read a TableInfo-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableInfo-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtTableInfoObj readTableInfo( Integer pkey );

	/**
	 *	Read a TableInfo-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableInfo-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecureProtTableInfoObj readTableInfo( Integer pkey,
		boolean forceRead );

	ISecureProtTableInfoObj readCachedTableInfo( Integer pkey );

	public void reallyDeepDisposeTableInfo( ISecureProtTableInfoObj obj );

	void deepDisposeTableInfo( Integer pkey );

	/**
	 *	Internal use only.
	 */
	ISecureProtTableInfoObj lockTableInfo( Integer pkey );

	/**
	 *	Return a sorted list of all the TableInfo-derived instances in the database.
	 *
	 *	@return	List of ISecureProtTableInfoObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtTableInfoObj> readAllTableInfo();

	/**
	 *	Return a sorted map of all the TableInfo-derived instances in the database.
	 *
	 *	@return	List of ISecureProtTableInfoObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecureProtTableInfoObj> readAllTableInfo( boolean forceRead );

	List<ISecureProtTableInfoObj> readCachedAllTableInfo();

	/**
	 *	Get the ISecureProtTableInfoObj instance for the primary key attributes.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoByIdIdx( int TableInfoId );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the primary key attributes.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoByIdIdx( int TableInfoId,
		boolean forceRead );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique TableNameIdx key.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj cached instance for the unique TableNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoByTableNameIdx(String TableName );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique TableNameIdx key.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj refreshed instance for the unique TableNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoByTableNameIdx(String TableName,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtTableInfoObj> instances sorted by their primary keys for the duplicate SuperNameIdx key.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtTableInfoObj> cached instances sorted by their primary keys for the duplicate SuperNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtTableInfoObj> readTableInfoBySuperNameIdx( String SuperName );

	/**
	 *	Get the map of List<ISecureProtTableInfoObj> instances sorted by their primary keys for the duplicate SuperNameIdx key.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtTableInfoObj> cached instances sorted by their primary keys for the duplicate SuperNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtTableInfoObj> readTableInfoBySuperNameIdx( String SuperName,
		boolean forceRead );

	/**
	 *	Get the map of List<ISecureProtTableInfoObj> instances sorted by their primary keys for the duplicate SchemaNameIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtTableInfoObj> cached instances sorted by their primary keys for the duplicate SchemaNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtTableInfoObj> readTableInfoBySchemaNameIdx( String SchemaName );

	/**
	 *	Get the map of List<ISecureProtTableInfoObj> instances sorted by their primary keys for the duplicate SchemaNameIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of List<ISecureProtTableInfoObj> cached instances sorted by their primary keys for the duplicate SchemaNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecureProtTableInfoObj> readTableInfoBySchemaNameIdx( String SchemaName,
		boolean forceRead );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique SchemaBkCodeIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj cached instance for the unique SchemaBkCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoBySchemaBkCodeIdx(String SchemaName,
		int BackingClassCode );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique SchemaBkCodeIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj refreshed instance for the unique SchemaBkCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoBySchemaBkCodeIdx(String SchemaName,
		int BackingClassCode,
		boolean forceRead );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique SchemaRTCodeIdx key.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj cached instance for the unique SchemaRTCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoBySchemaRTCodeIdx(int RuntimeClassCode );

	/**
	 *	Get the ISecureProtTableInfoObj instance for the unique SchemaRTCodeIdx key.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	ISecureProtTableInfoObj refreshed instance for the unique SchemaRTCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecureProtTableInfoObj readTableInfoBySchemaRTCodeIdx(int RuntimeClassCode,
		boolean forceRead );

	ISecureProtTableInfoObj readCachedTableInfoByIdIdx( int TableInfoId );

	ISecureProtTableInfoObj readCachedTableInfoByTableNameIdx( String TableName );

	List<List<ISecureProtTableInfoObj>> readCachedTableInfoBySuperNameIdx( String SuperName );

	List<List<ISecureProtTableInfoObj>> readCachedTableInfoBySchemaNameIdx( String SchemaName );

	ISecureProtTableInfoObj readCachedTableInfoBySchemaBkCodeIdx( String SchemaName,
		int BackingClassCode );

	ISecureProtTableInfoObj readCachedTableInfoBySchemaRTCodeIdx( int RuntimeClassCode );

	void deepDisposeTableInfoByIdIdx( int TableInfoId );

	void deepDisposeTableInfoByTableNameIdx( String TableName );

	void deepDisposeTableInfoBySuperNameIdx( String SuperName );

	void deepDisposeTableInfoBySchemaNameIdx( String SchemaName );

	void deepDisposeTableInfoBySchemaBkCodeIdx( String SchemaName,
		int BackingClassCode );

	void deepDisposeTableInfoBySchemaRTCodeIdx( int RuntimeClassCode );

	/**
	 *	Internal use only.
	 */
	ISecureProtTableInfoObj updateTableInfo( ISecureProtTableInfoObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableInfo( ISecureProtTableInfoObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoByIdIdx( int TableInfoId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoByTableNameIdx(String TableName );

	/**
	 *	Internal use only.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoBySuperNameIdx( String SuperName );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoBySchemaNameIdx( String SchemaName );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoBySchemaBkCodeIdx(String SchemaName,
		int BackingClassCode );

	/**
	 *	Internal use only.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 */
	void deleteTableInfoBySchemaRTCodeIdx(int RuntimeClassCode );
}
