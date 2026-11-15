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

public interface IBusModelUuidDefTableObj
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
	 *	Instantiate a new UuidDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelUuidDefObj newInstance();

	/**
	 *	Instantiate a new UuidDef edition of the specified UuidDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelUuidDefEditObj newEditInstance( IBusModelUuidDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidDefObj realiseUuidDef( IBusModelUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidDefObj createUuidDef( IBusModelUuidDefObj Obj );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuidDefObj readUuidDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a UuidDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UuidDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuidDefObj readUuidDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelUuidDefObj readCachedUuidDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeUuidDef( IBusModelUuidDefObj obj );

	void deepDisposeUuidDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidDefObj lockUuidDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuidDefObj> readAllUuidDef();

	/**
	 *	Return a sorted map of all the UuidDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuidDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuidDefObj> readAllUuidDef( boolean forceRead );

	List<IBusModelUuidDefObj> readCachedAllUuidDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidDefObj readUuidDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidDefObj readUuidDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidDefObj readUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuidDefObj readUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuidDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuidDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuidDefObj> readUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelUuidDefObj readCachedUuidDefByIdIdx( ICFKeyHash256 Id );

	IBusModelUuidDefObj readCachedUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelUuidDefObj> readCachedUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelUuidDefObj> readCachedUuidDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelUuidDefObj> readCachedUuidDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelUuidDefObj> readCachedUuidDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelUuidDefObj> readCachedUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelUuidDefObj> readCachedUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeUuidDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuidDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeUuidDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeUuidDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelUuidDefObj updateUuidDef( IBusModelUuidDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuidDef( IBusModelUuidDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UuidDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UuidDef key attribute of the instance generating the id.
	 */
	void deleteUuidDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelUuidDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuidDefObj refreshed cache instance.
	 */
	IBusModelUuidDefObj moveUpUuidDef( IBusModelUuidDefObj Obj );

	/**
	 *	Move the BusModelUuidDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuidDefObj refreshed cache instance.
	 */
	IBusModelUuidDefObj moveDownUuidDef( IBusModelUuidDefObj Obj );
}
