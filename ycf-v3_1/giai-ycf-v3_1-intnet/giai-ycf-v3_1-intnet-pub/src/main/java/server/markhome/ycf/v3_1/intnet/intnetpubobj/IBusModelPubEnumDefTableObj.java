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

public interface IBusModelPubEnumDefTableObj
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
	 *	Instantiate a new EnumDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubEnumDefObj newInstance();

	/**
	 *	Instantiate a new EnumDef edition of the specified EnumDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubEnumDefEditObj newEditInstance( IBusModelPubEnumDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumDefObj realiseEnumDef( IBusModelPubEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumDefObj createEnumDef( IBusModelPubEnumDefObj Obj );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubEnumDefObj readEnumDef( ICFKeyHash256 pkey );

	/**
	 *	Read a EnumDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The EnumDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubEnumDefObj readEnumDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubEnumDefObj readCachedEnumDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeEnumDef( IBusModelPubEnumDefObj obj );

	void deepDisposeEnumDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumDefObj lockEnumDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubEnumDefObj> readAllEnumDef();

	/**
	 *	Return a sorted map of all the EnumDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubEnumDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubEnumDefObj> readAllEnumDef( boolean forceRead );

	List<IBusModelPubEnumDefObj> readCachedAllEnumDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumDefObj readEnumDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumDefObj readEnumDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumDefObj readEnumDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubEnumDefObj readEnumDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubEnumDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubEnumDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubEnumDefObj> readEnumDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubEnumDefObj readCachedEnumDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubEnumDefObj readCachedEnumDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubEnumDefObj> readCachedEnumDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeEnumDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeEnumDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeEnumDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeEnumDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeEnumDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeEnumDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeEnumDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeEnumDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubEnumDefObj updateEnumDef( IBusModelPubEnumDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteEnumDef( IBusModelPubEnumDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByScopeIdx( CFDbKeyHash256 ScopeId );

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
	void deleteEnumDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The EnumDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The EnumDef key attribute of the instance generating the id.
	 */
	void deleteEnumDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubEnumDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubEnumDefObj refreshed cache instance.
	 */
	IBusModelPubEnumDefObj moveUpEnumDef( IBusModelPubEnumDefObj Obj );

	/**
	 *	Move the BusModelPubEnumDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubEnumDefObj refreshed cache instance.
	 */
	IBusModelPubEnumDefObj moveDownEnumDef( IBusModelPubEnumDefObj Obj );
}
