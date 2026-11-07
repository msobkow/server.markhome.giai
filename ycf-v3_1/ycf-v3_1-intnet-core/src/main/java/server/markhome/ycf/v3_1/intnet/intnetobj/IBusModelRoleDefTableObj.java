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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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

public interface IBusModelRoleDefTableObj
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
	 *	Instantiate a new RoleDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelRoleDefObj newInstance();

	/**
	 *	Instantiate a new RoleDef edition of the specified RoleDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelRoleDefEditObj newEditInstance( IBusModelRoleDefObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelRoleDefObj instance, which may be a subclass of a RoleDef instance.
	 */
	IBusModelRoleDefObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelRoleDefObj realiseRoleDef( IBusModelRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelRoleDefObj createRoleDef( IBusModelRoleDefObj Obj );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelRoleDefObj readRoleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a RoleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The RoleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelRoleDefObj readRoleDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelRoleDefObj readCachedRoleDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeRoleDef( IBusModelRoleDefObj obj );

	void deepDisposeRoleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelRoleDefObj lockRoleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelRoleDefObj> readAllRoleDef();

	/**
	 *	Return a sorted map of all the RoleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelRoleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelRoleDefObj> readAllRoleDef( boolean forceRead );

	List<IBusModelRoleDefObj> readCachedAllRoleDef();

	/**
	 *	Get the BusModelRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelRoleDefObj instance for the primary key attributes.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByUNameIdx(ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByUNameIdx(ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRoleDefObj> readRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRoleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRoleDefObj> readRoleDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRoleDefObj> readRoleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelRoleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelRoleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelRoleDefObj> readRoleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByUDefIdx(ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelRoleDefObj instance for the unique UDefIdx key.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelRoleDefObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelRoleDefObj readRoleDefByUDefIdx(ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	IBusModelRoleDefObj readCachedRoleDefByIdIdx( ICFKeyHash256 Id );

	IBusModelRoleDefObj readCachedRoleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelRoleDefObj> readCachedRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelRoleDefObj> readCachedRoleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelRoleDefObj readCachedRoleDefByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeRoleDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeRoleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeRoleDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeRoleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeRoleDefByUDefIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelRoleDefObj updateRoleDef( IBusModelRoleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteRoleDef( IBusModelRoleDefObj Obj );

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
	void deleteRoleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

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
		ICFKeyHash256 DefSchemaId,
		String Name );
}
