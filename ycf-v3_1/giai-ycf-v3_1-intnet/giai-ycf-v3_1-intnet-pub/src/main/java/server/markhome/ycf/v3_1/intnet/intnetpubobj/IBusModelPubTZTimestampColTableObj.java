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

public interface IBusModelPubTZTimestampColTableObj
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
	 *	Instantiate a new TZTimestampCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTZTimestampColObj newInstance();

	/**
	 *	Instantiate a new TZTimestampCol edition of the specified TZTimestampCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTZTimestampColEditObj newEditInstance( IBusModelPubTZTimestampColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampColObj realiseTZTimestampCol( IBusModelPubTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampColObj createTZTimestampCol( IBusModelPubTZTimestampColObj Obj );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TZTimestampCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimestampCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTZTimestampColObj readCachedTZTimestampCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTZTimestampCol( IBusModelPubTZTimestampColObj obj );

	void deepDisposeTZTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampColObj lockTZTimestampCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readAllTZTimestampCol();

	/**
	 *	Return a sorted map of all the TZTimestampCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTZTimestampColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readAllTZTimestampCol( boolean forceRead );

	List<IBusModelPubTZTimestampColObj> readCachedAllTZTimestampCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTZTimestampColObj readTZTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTZTimestampColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTZTimestampColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTZTimestampColObj> readTZTimestampColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubTZTimestampColObj readCachedTZTimestampColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTZTimestampColObj readCachedTZTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTZTimestampColObj> readCachedTZTimestampColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTZTimestampColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTZTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTZTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTZTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTZTimestampColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTZTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTZTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTZTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTZTimestampColObj updateTZTimestampCol( IBusModelPubTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimestampCol( IBusModelPubTZTimestampColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimestampCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TZTimestampCol key attribute of the instance generating the id.
	 */
	void deleteTZTimestampColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubTZTimestampColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimestampColObj refreshed cache instance.
	 */
	IBusModelPubTZTimestampColObj moveUpTZTimestampCol( IBusModelPubTZTimestampColObj Obj );

	/**
	 *	Move the BusModelPubTZTimestampColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTZTimestampColObj refreshed cache instance.
	 */
	IBusModelPubTZTimestampColObj moveDownTZTimestampCol( IBusModelPubTZTimestampColObj Obj );
}
