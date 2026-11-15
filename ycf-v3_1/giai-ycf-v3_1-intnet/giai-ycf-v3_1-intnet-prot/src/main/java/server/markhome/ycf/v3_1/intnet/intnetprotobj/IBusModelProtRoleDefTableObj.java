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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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

public interface IBusModelProtRoleDefTableObj
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
	 *	Instantiate a new RoleDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtRoleDefObj newInstance();

	/**
	 *	Instantiate a new RoleDef edition of the specified RoleDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtRoleDefEditObj newEditInstance( IBusModelProtRoleDefObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtRoleDefEditObj instance, which may be a subclass of a RoleDef instance.
	 */
	IBusModelProtRoleDefObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRoleDefObj realiseRoleDef( IBusModelProtRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRoleDefObj createRoleDef( IBusModelProtRoleDefObj Obj );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtRoleDefObj readRoleDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtRoleDefObj readRoleDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtRoleDefObj readCachedRoleDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeRoleDef( IBusModelProtRoleDefObj obj );

	void deepDisposeRoleDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRoleDefObj lockRoleDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtRoleDefObj> readAllRoleDef();

	/**
	 *	Return a sorted map of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtRoleDefObj> readAllRoleDef( boolean forceRead );

	List<IBusModelProtRoleDefObj> readCachedAllRoleDef();

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByUNameIdx(ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByUNameIdx(ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRoleDefObj> instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRoleDefObj> cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRoleDefObj> readRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of List<IBusModelProtRoleDefObj> instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRoleDefObj> cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRoleDefObj> readRoleDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtRoleDefObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRoleDefObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRoleDefObj> readRoleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtRoleDefObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtRoleDefObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtRoleDefObj> readRoleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByUDefIdx(ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the IBusModelProtRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtRoleDefObj readRoleDefByUDefIdx(ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	IBusModelProtRoleDefObj readCachedRoleDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtRoleDefObj readCachedRoleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtRoleDefObj>> readCachedRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtRoleDefObj>> readCachedRoleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtRoleDefObj readCachedRoleDefByUDefIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeRoleDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeRoleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeRoleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeRoleDefByUDefIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelProtRoleDefObj updateRoleDef( IBusModelProtRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRoleDef( IBusModelProtRoleDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUNameIdx(ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUDefIdx(ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaId,
		String Name );
}
