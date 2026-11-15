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

public interface IBusModelPubSchemaRoleTableObj
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
	 *	Instantiate a new SchemaRole instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubSchemaRoleObj newInstance();

	/**
	 *	Instantiate a new SchemaRole edition of the specified SchemaRole instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubSchemaRoleEditObj newEditInstance( IBusModelPubSchemaRoleObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRoleObj realiseSchemaRole( IBusModelPubSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRoleObj createSchemaRole( IBusModelPubSchemaRoleObj Obj );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRole( ICFKeyHash256 pkey );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRole( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubSchemaRoleObj readCachedSchemaRole( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSchemaRole( IBusModelPubSchemaRoleObj obj );

	void deepDisposeSchemaRole( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRoleObj lockSchemaRole( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readAllSchemaRole();

	/**
	 *	Return a sorted map of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readAllSchemaRole( boolean forceRead );

	List<IBusModelPubSchemaRoleObj> readCachedAllSchemaRole();

	/**
	 *	Get the BusModelPubRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByUDefIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelPubRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaRoleObj readSchemaRoleByUDefIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of BusModelPubSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	IBusModelPubSchemaRoleObj readCachedSchemaRoleByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubSchemaRoleObj readCachedSchemaRoleByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubSchemaRoleObj> readCachedSchemaRoleByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubSchemaRoleObj> readCachedSchemaRoleByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelPubSchemaRoleObj readCachedSchemaRoleByUDefIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	List<IBusModelPubSchemaRoleObj> readCachedSchemaRoleBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	List<IBusModelPubSchemaRoleObj> readCachedSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	List<IBusModelPubSchemaRoleObj> readCachedSchemaRoleBySchRoleScpIdx( CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeSchemaRoleByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeSchemaRoleByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeSchemaRoleByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeSchemaRoleByUDefIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeSchemaRoleBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleBySchRoleScpIdx( CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaRoleObj updateSchemaRole( IBusModelPubSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRole( IBusModelPubSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUDefIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchRoleScpIdx( CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );
}
