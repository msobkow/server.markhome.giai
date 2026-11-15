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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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

public interface IBusModelPubBoolColTableObj
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
	 *	Instantiate a new BoolCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubBoolColObj newInstance();

	/**
	 *	Instantiate a new BoolCol edition of the specified BoolCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubBoolColEditObj newEditInstance( IBusModelPubBoolColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolColObj realiseBoolCol( IBusModelPubBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolColObj createBoolCol( IBusModelPubBoolColObj Obj );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBoolColObj readBoolCol( ICFKeyHash256 pkey );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBoolColObj readBoolCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubBoolColObj readCachedBoolCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeBoolCol( IBusModelPubBoolColObj obj );

	void deepDisposeBoolCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolColObj lockBoolCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBoolColObj> readAllBoolCol();

	/**
	 *	Return a sorted map of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBoolColObj> readAllBoolCol( boolean forceRead );

	List<IBusModelPubBoolColObj> readCachedAllBoolCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolColObj readBoolColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolColObj readBoolColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolColObj readBoolColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBoolColObj readBoolColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubBoolColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBoolColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBoolColObj> readBoolColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubBoolColObj readCachedBoolColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubBoolColObj readCachedBoolColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubBoolColObj> readCachedBoolColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubBoolColObj> readCachedBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubBoolColObj> readCachedBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubBoolColObj> readCachedBoolColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubBoolColObj> readCachedBoolColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubBoolColObj> readCachedBoolColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubBoolColObj> readCachedBoolColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeBoolColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeBoolColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeBoolColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeBoolColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeBoolColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeBoolColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBoolColObj updateBoolCol( IBusModelPubBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolCol( IBusModelPubBoolColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubBoolColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBoolColObj refreshed cache instance.
	 */
	IBusModelPubBoolColObj moveUpBoolCol( IBusModelPubBoolColObj Obj );

	/**
	 *	Move the BusModelPubBoolColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBoolColObj refreshed cache instance.
	 */
	IBusModelPubBoolColObj moveDownBoolCol( IBusModelPubBoolColObj Obj );
}
