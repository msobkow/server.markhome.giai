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

public interface IBusModelProtDateTypeTableObj
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
	 *	Instantiate a new DateType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtDateTypeObj newInstance();

	/**
	 *	Instantiate a new DateType edition of the specified DateType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtDateTypeEditObj newEditInstance( IBusModelProtDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDateTypeObj realiseDateType( IBusModelProtDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDateTypeObj createDateType( IBusModelProtDateTypeObj Obj );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDateTypeObj readDateType( CFDbKeyHash256 pkey );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtDateTypeObj readDateType( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtDateTypeObj readCachedDateType( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeDateType( IBusModelProtDateTypeObj obj );

	void deepDisposeDateType( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDateTypeObj lockDateType( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDateTypeObj> readAllDateType();

	/**
	 *	Return a sorted map of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtDateTypeObj> readAllDateType( boolean forceRead );

	List<IBusModelProtDateTypeObj> readCachedAllDateType();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDateTypeObj readDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDateTypeObj readDateTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDateTypeObj readDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtDateTypeObj readDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtDateTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDateTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of List<IBusModelProtDateTypeObj> instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtDateTypeObj> cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtDateTypeObj> readDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelProtValueObj readCachedDateTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtDateTypeObj>> readCachedDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDateTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDateTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDateTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDateTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtDateTypeObj updateDateType( IBusModelProtDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateType( IBusModelProtDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the IBusModelProtDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDateTypeObj refreshed cache instance.
	 */
	IBusModelProtDateTypeObj moveUpDateType( IBusModelProtDateTypeObj Obj );

	/**
	 *	Move the IBusModelProtDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtDateTypeObj refreshed cache instance.
	 */
	IBusModelProtDateTypeObj moveDownDateType( IBusModelProtDateTypeObj Obj );
}
