// Description: Java 25 Public Table Object interface for SecurePub.

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

package server.markhome.ycf.v3_1.secure.securepubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface ISecurePubTableInfoTableObj
{
	public ISecurePubSchemaObj getSchema();
	public void setSchema( ISecurePubSchemaObj value );

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
	ISecurePubTableInfoObj newInstance();

	/**
	 *	Instantiate a new TableInfo edition of the specified TableInfo instance.
	 *
	 *	@return	A new edition.
	 */
	ISecurePubTableInfoEditObj newEditInstance( ISecurePubTableInfoObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	ISecurePubTableInfoObj instance, which may be a subclass of a TableInfo instance.
	 */
	ISecurePubTableInfoObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	ISecurePubTableInfoObj realiseTableInfo( ISecurePubTableInfoObj Obj );

	/**
	 *	Internal use only.
	 */
	ISecurePubTableInfoObj createTableInfo( ISecurePubTableInfoObj Obj );

	/**
	 *	Read a TableInfo-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableInfo-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubTableInfoObj readTableInfo( Integer pkey );

	/**
	 *	Read a TableInfo-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableInfo-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ISecurePubTableInfoObj readTableInfo( Integer pkey,
		boolean forceRead );

	ISecurePubTableInfoObj readCachedTableInfo( Integer pkey );

	public void reallyDeepDisposeTableInfo( ISecurePubTableInfoObj obj );

	void deepDisposeTableInfo( Integer pkey );

	/**
	 *	Internal use only.
	 */
	ISecurePubTableInfoObj lockTableInfo( Integer pkey );

	/**
	 *	Return a sorted list of all the TableInfo-derived instances in the database.
	 *
	 *	@return	List of ISecurePubTableInfoObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubTableInfoObj> readAllTableInfo();

	/**
	 *	Return a sorted map of all the TableInfo-derived instances in the database.
	 *
	 *	@return	List of ISecurePubTableInfoObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ISecurePubTableInfoObj> readAllTableInfo( boolean forceRead );

	List<ISecurePubTableInfoObj> readCachedAllTableInfo();

	/**
	 *	Get the SecurePubTableInfoObj instance for the primary key attributes.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoByIdIdx( int TableInfoId );

	/**
	 *	Get the SecurePubTableInfoObj instance for the primary key attributes.
	 *
	 *	@param	TableInfoId	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoByIdIdx( int TableInfoId,
		boolean forceRead );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique TableNameIdx key.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj cached instance for the unique TableNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoByTableNameIdx(String TableName );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique TableNameIdx key.
	 *
	 *	@param	TableName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj refreshed instance for the unique TableNameIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoByTableNameIdx(String TableName,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubTableInfoObj instances sorted by their primary keys for the duplicate SuperNameIdx key.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubTableInfoObj cached instances sorted by their primary keys for the duplicate SuperNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubTableInfoObj> readTableInfoBySuperNameIdx( String SuperName );

	/**
	 *	Get the map of SecurePubTableInfoObj instances sorted by their primary keys for the duplicate SuperNameIdx key.
	 *
	 *	@param	SuperName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubTableInfoObj cached instances sorted by their primary keys for the duplicate SuperNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubTableInfoObj> readTableInfoBySuperNameIdx( String SuperName,
		boolean forceRead );

	/**
	 *	Get the map of SecurePubTableInfoObj instances sorted by their primary keys for the duplicate SchemaNameIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubTableInfoObj cached instances sorted by their primary keys for the duplicate SchemaNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubTableInfoObj> readTableInfoBySchemaNameIdx( String SchemaName );

	/**
	 *	Get the map of SecurePubTableInfoObj instances sorted by their primary keys for the duplicate SchemaNameIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	List of SecurePubTableInfoObj cached instances sorted by their primary keys for the duplicate SchemaNameIdx key,
	 *		which may be an empty set.
	 */
	List<ISecurePubTableInfoObj> readTableInfoBySchemaNameIdx( String SchemaName,
		boolean forceRead );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique SchemaBkCodeIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj cached instance for the unique SchemaBkCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoBySchemaBkCodeIdx(String SchemaName,
		int BackingClassCode );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique SchemaBkCodeIdx key.
	 *
	 *	@param	SchemaName	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@param	BackingClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj refreshed instance for the unique SchemaBkCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoBySchemaBkCodeIdx(String SchemaName,
		int BackingClassCode,
		boolean forceRead );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique SchemaRTCodeIdx key.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj cached instance for the unique SchemaRTCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoBySchemaRTCodeIdx(int RuntimeClassCode );

	/**
	 *	Get the SecurePubTableInfoObj instance for the unique SchemaRTCodeIdx key.
	 *
	 *	@param	RuntimeClassCode	The TableInfo key attribute of the instance generating the id.
	 *
	 *	@return	SecurePubTableInfoObj refreshed instance for the unique SchemaRTCodeIdx key, or
	 *		null if no such instance exists.
	 */
	ISecurePubTableInfoObj readTableInfoBySchemaRTCodeIdx(int RuntimeClassCode,
		boolean forceRead );

	ISecurePubTableInfoObj readCachedTableInfoByIdIdx( int TableInfoId );

	ISecurePubTableInfoObj readCachedTableInfoByTableNameIdx( String TableName );

	List<ISecurePubTableInfoObj> readCachedTableInfoBySuperNameIdx( String SuperName );

	List<ISecurePubTableInfoObj> readCachedTableInfoBySchemaNameIdx( String SchemaName );

	ISecurePubTableInfoObj readCachedTableInfoBySchemaBkCodeIdx( String SchemaName,
		int BackingClassCode );

	ISecurePubTableInfoObj readCachedTableInfoBySchemaRTCodeIdx( int RuntimeClassCode );

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
	ISecurePubTableInfoObj updateTableInfo( ISecurePubTableInfoObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableInfo( ISecurePubTableInfoObj Obj );

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
