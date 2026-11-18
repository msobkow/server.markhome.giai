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

public interface IBusModelProtUInt64DefTableObj
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
	 *	Instantiate a new UInt64Def instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtUInt64DefObj newInstance();

	/**
	 *	Instantiate a new UInt64Def edition of the specified UInt64Def instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtUInt64DefEditObj newEditInstance( IBusModelProtUInt64DefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUInt64DefObj realiseUInt64Def( IBusModelProtUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUInt64DefObj createUInt64Def( IBusModelProtUInt64DefObj Obj );

	/**
	 *	Read a UInt64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUInt64DefObj readUInt64Def( CFDbKeyHash256 pkey );

	/**
	 *	Read a UInt64Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt64Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtUInt64DefObj readUInt64Def( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtUInt64DefObj readCachedUInt64Def( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeUInt64Def( IBusModelProtUInt64DefObj obj );

	void deepDisposeUInt64Def( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUInt64DefObj lockUInt64Def( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the UInt64Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readAllUInt64Def();

	/**
	 *	Return a sorted map of all the UInt64Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readAllUInt64Def( boolean forceRead );

	List<IBusModelProtUInt64DefObj> readCachedAllUInt64Def();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUInt64DefObj readUInt64DefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUInt64DefObj readUInt64DefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUInt64DefObj readUInt64DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtUInt64DefObj readUInt64DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtUInt64DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtUInt64DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtUInt64DefObj> readUInt64DefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedUInt64DefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedUInt64DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedUInt64DefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeUInt64DefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUInt64DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt64DefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUInt64DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeUInt64DefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeUInt64DefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeUInt64DefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeUInt64DefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtUInt64DefObj updateUInt64Def( IBusModelProtUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt64Def( IBusModelProtUInt64DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt64Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt64Def key attribute of the instance generating the id.
	 */
	void deleteUInt64DefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtUInt64DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUInt64DefObj refreshed cache instance.
	 */
	IBusModelProtUInt64DefObj moveUpUInt64Def( IBusModelProtUInt64DefObj Obj );

	/**
	 *	Move the IBusModelProtUInt64DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtUInt64DefObj refreshed cache instance.
	 */
	IBusModelProtUInt64DefObj moveDownUInt64Def( IBusModelProtUInt64DefObj Obj );
}
