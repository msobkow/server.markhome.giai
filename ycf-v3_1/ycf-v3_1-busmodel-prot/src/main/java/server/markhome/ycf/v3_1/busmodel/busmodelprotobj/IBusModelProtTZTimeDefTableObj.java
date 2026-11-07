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

public interface IBusModelProtTZTimeDefTableObj
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
	 *	Instantiate a new TZTimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTZTimeDefObj newInstance();

	/**
	 *	Instantiate a new TZTimeDef edition of the specified TZTimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTZTimeDefEditObj newEditInstance( IBusModelProtTZTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZTimeDefObj realiseTZTimeDef( IBusModelProtTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZTimeDefObj createTZTimeDef( IBusModelProtTZTimeDefObj Obj );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a TZTimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTZTimeDefObj readCachedTZTimeDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTZTimeDef( IBusModelProtTZTimeDefObj obj );

	void deepDisposeTZTimeDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZTimeDefObj lockTZTimeDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readAllTZTimeDef();

	/**
	 *	Return a sorted map of all the TZTimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readAllTZTimeDef( boolean forceRead );

	List<IBusModelProtTZTimeDefObj> readCachedAllTZTimeDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTZTimeDefObj readTZTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTZTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTZTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTZTimeDefObj> readTZTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTZTimeDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTZTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTZTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTZTimeDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTZTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTZTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTZTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTZTimeDefObj updateTZTimeDef( IBusModelProtTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeDef( IBusModelProtTZTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeDef key attribute of the instance generating the id.
	 */
	void deleteTZTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtTZTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTZTimeDefObj refreshed cache instance.
	 */
	IBusModelProtTZTimeDefObj moveUpTZTimeDef( IBusModelProtTZTimeDefObj Obj );

	/**
	 *	Move the IBusModelProtTZTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTZTimeDefObj refreshed cache instance.
	 */
	IBusModelProtTZTimeDefObj moveDownTZTimeDef( IBusModelProtTZTimeDefObj Obj );
}
