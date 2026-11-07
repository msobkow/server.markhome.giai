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

public interface IBusModelProtEnumDefTableObj
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
	 *	Instantiate a new EnumDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtEnumDefObj newInstance();

	/**
	 *	Instantiate a new EnumDef edition of the specified EnumDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtEnumDefEditObj newEditInstance( IBusModelProtEnumDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumDefObj realiseEnumDef( IBusModelProtEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumDefObj createEnumDef( IBusModelProtEnumDefObj Obj );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtEnumDefObj readEnumDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtEnumDefObj readEnumDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtEnumDefObj readCachedEnumDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeEnumDef( IBusModelProtEnumDefObj obj );

	void deepDisposeEnumDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumDefObj lockEnumDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtEnumDefObj> readAllEnumDef();

	/**
	 *	Return a sorted map of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtEnumDefObj> readAllEnumDef( boolean forceRead );

	List<IBusModelProtEnumDefObj> readCachedAllEnumDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumDefObj readEnumDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumDefObj readEnumDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumDefObj readEnumDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtEnumDefObj readEnumDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtEnumDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtEnumDefObj> readEnumDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedEnumDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedEnumDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedEnumDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeEnumDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeEnumDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeEnumDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeEnumDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeEnumDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeEnumDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtEnumDefObj updateEnumDef( IBusModelProtEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumDef( IBusModelProtEnumDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtEnumDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtEnumDefObj refreshed cache instance.
	 */
	IBusModelProtEnumDefObj moveUpEnumDef( IBusModelProtEnumDefObj Obj );

	/**
	 *	Move the IBusModelProtEnumDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtEnumDefObj refreshed cache instance.
	 */
	IBusModelProtEnumDefObj moveDownEnumDef( IBusModelProtEnumDefObj Obj );
}
