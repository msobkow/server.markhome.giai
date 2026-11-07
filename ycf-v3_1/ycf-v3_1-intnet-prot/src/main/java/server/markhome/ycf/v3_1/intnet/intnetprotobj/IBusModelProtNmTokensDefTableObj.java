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

public interface IBusModelProtNmTokensDefTableObj
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
	 *	Instantiate a new NmTokensDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtNmTokensDefObj newInstance();

	/**
	 *	Instantiate a new NmTokensDef edition of the specified NmTokensDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtNmTokensDefEditObj newEditInstance( IBusModelProtNmTokensDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNmTokensDefObj realiseNmTokensDef( IBusModelProtNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNmTokensDefObj createNmTokensDef( IBusModelProtNmTokensDefObj Obj );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtNmTokensDefObj readCachedNmTokensDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeNmTokensDef( IBusModelProtNmTokensDefObj obj );

	void deepDisposeNmTokensDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNmTokensDefObj lockNmTokensDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readAllNmTokensDef();

	/**
	 *	Return a sorted map of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readAllNmTokensDef( boolean forceRead );

	List<IBusModelProtNmTokensDefObj> readCachedAllNmTokensDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtNmTokensDefObj readNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtNmTokensDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtNmTokensDefObj> readNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedNmTokensDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeNmTokensDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtNmTokensDefObj updateNmTokensDef( IBusModelProtNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensDef( IBusModelProtNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtNmTokensDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtNmTokensDefObj refreshed cache instance.
	 */
	IBusModelProtNmTokensDefObj moveUpNmTokensDef( IBusModelProtNmTokensDefObj Obj );

	/**
	 *	Move the IBusModelProtNmTokensDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtNmTokensDefObj refreshed cache instance.
	 */
	IBusModelProtNmTokensDefObj moveDownNmTokensDef( IBusModelProtNmTokensDefObj Obj );
}
