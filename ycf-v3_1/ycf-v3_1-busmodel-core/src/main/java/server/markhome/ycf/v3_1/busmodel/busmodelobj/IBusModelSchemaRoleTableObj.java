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

public interface IBusModelSchemaRoleTableObj
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
	 *	Instantiate a new SchemaRole instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelSchemaRoleObj newInstance();

	/**
	 *	Instantiate a new SchemaRole edition of the specified SchemaRole instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelSchemaRoleEditObj newEditInstance( IBusModelSchemaRoleObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaRoleObj realiseSchemaRole( IBusModelSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaRoleObj createSchemaRole( IBusModelSchemaRoleObj Obj );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelSchemaRoleObj readSchemaRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SchemaRole-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaRole-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelSchemaRoleObj readSchemaRole( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelSchemaRoleObj readCachedSchemaRole( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSchemaRole( IBusModelSchemaRoleObj obj );

	void deepDisposeSchemaRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaRoleObj lockSchemaRole( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of IBusModelSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelSchemaRoleObj> readAllSchemaRole();

	/**
	 *	Return a sorted map of all the SchemaRole-derived instances in the database.
	 *
	 *	@return	List of IBusModelSchemaRoleObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelSchemaRoleObj> readAllSchemaRole( boolean forceRead );

	List<IBusModelSchemaRoleObj> readCachedAllSchemaRole();

	/**
	 *	Get the BusModelRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaRoleObj readSchemaRoleByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate RoleScopeIdx key.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate RoleScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Get the map of BusModelSchemaRoleObj instances sorted by their primary keys for the duplicate SchRoleScpIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	RoleScope	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaRoleObj cached instances sorted by their primary keys for the duplicate SchRoleScpIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaRoleObj> readSchemaRoleBySchRoleScpIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope,
		boolean forceRead );

	IBusModelSchemaRoleObj readCachedSchemaRoleByIdIdx( ICFKeyHash256 Id );

	IBusModelSchemaRoleObj readCachedSchemaRoleByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelSchemaRoleObj> readCachedSchemaRoleByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelSchemaRoleObj> readCachedSchemaRoleByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelSchemaRoleObj readCachedSchemaRoleByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	List<IBusModelSchemaRoleObj> readCachedSchemaRoleBySchemaIdx( ICFKeyHash256 SchemaDefId );

	List<IBusModelSchemaRoleObj> readCachedSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	List<IBusModelSchemaRoleObj> readCachedSchemaRoleBySchRoleScpIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleByIdIdx( ICFKeyHash256 Id );

	void deepDisposeSchemaRoleByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeSchemaRoleByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeSchemaRoleByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeSchemaRoleByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeSchemaRoleBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeSchemaRoleByRoleScopeIdx( IBusModelPubSchema.RoleScopeEnum RoleScope );

	void deepDisposeSchemaRoleBySchRoleScpIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaRoleObj updateSchemaRole( IBusModelSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaRole( IBusModelSchemaRoleObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The SchemaRole key attribute of the instance generating the id.
	 */
	void deleteSchemaRoleBySchemaIdx( ICFKeyHash256 SchemaDefId );

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
	void deleteSchemaRoleBySchRoleScpIdx( ICFKeyHash256 SchemaDefId,
		IBusModelPubSchema.RoleScopeEnum RoleScope );
}
