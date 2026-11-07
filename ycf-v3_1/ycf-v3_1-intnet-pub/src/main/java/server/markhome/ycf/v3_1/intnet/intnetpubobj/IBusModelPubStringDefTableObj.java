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

public interface IBusModelPubStringDefTableObj
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
	 *	Instantiate a new StringDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubStringDefObj newInstance();

	/**
	 *	Instantiate a new StringDef edition of the specified StringDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubStringDefEditObj newEditInstance( IBusModelPubStringDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubStringDefObj realiseStringDef( IBusModelPubStringDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubStringDefObj createStringDef( IBusModelPubStringDefObj Obj );

	/**
	 *	Read a StringDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubStringDefObj readStringDef( ICFKeyHash256 pkey );

	/**
	 *	Read a StringDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The StringDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubStringDefObj readStringDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubStringDefObj readCachedStringDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeStringDef( IBusModelPubStringDefObj obj );

	void deepDisposeStringDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubStringDefObj lockStringDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the StringDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubStringDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubStringDefObj> readAllStringDef();

	/**
	 *	Return a sorted map of all the StringDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubStringDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubStringDefObj> readAllStringDef( boolean forceRead );

	List<IBusModelPubStringDefObj> readCachedAllStringDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubStringDefObj readStringDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubStringDefObj readStringDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubStringDefObj readStringDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubStringDefObj readStringDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubStringDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubStringDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubStringDefObj> readStringDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubStringDefObj readCachedStringDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubStringDefObj readCachedStringDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubStringDefObj> readCachedStringDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubStringDefObj> readCachedStringDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubStringDefObj> readCachedStringDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubStringDefObj> readCachedStringDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubStringDefObj> readCachedStringDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubStringDefObj> readCachedStringDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeStringDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeStringDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeStringDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeStringDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeStringDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeStringDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeStringDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeStringDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubStringDefObj updateStringDef( IBusModelPubStringDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteStringDef( IBusModelPubStringDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The StringDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringDef key attribute of the instance generating the id.
	 */
	void deleteStringDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubStringDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubStringDefObj refreshed cache instance.
	 */
	IBusModelPubStringDefObj moveUpStringDef( IBusModelPubStringDefObj Obj );

	/**
	 *	Move the BusModelPubStringDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubStringDefObj refreshed cache instance.
	 */
	IBusModelPubStringDefObj moveDownStringDef( IBusModelPubStringDefObj Obj );
}
