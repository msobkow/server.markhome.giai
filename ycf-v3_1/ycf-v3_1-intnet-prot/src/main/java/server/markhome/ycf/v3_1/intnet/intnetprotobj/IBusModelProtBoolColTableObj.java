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

public interface IBusModelProtBoolColTableObj
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
	 *	Instantiate a new BoolCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtBoolColObj newInstance();

	/**
	 *	Instantiate a new BoolCol edition of the specified BoolCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtBoolColEditObj newEditInstance( IBusModelProtBoolColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolColObj realiseBoolCol( IBusModelProtBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolColObj createBoolCol( IBusModelProtBoolColObj Obj );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtBoolColObj readBoolCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a BoolCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtBoolColObj readBoolCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtBoolColObj readCachedBoolCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeBoolCol( IBusModelProtBoolColObj obj );

	void deepDisposeBoolCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolColObj lockBoolCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtBoolColObj> readAllBoolCol();

	/**
	 *	Return a sorted map of all the BoolCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtBoolColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtBoolColObj> readAllBoolCol( boolean forceRead );

	List<IBusModelProtBoolColObj> readCachedAllBoolCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolColObj readBoolColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolColObj readBoolColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolColObj readBoolColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolColObj readBoolColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtBoolColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtBoolColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtBoolColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtBoolColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtBoolColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolColObj> readBoolColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedBoolColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedBoolColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedBoolColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedBoolColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedBoolColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedBoolColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtBoolColObj>> readCachedBoolColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeBoolColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeBoolColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeBoolColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeBoolColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeBoolColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeBoolColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeBoolColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeBoolColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolColObj updateBoolCol( IBusModelProtBoolColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolCol( IBusModelProtBoolColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByScopeIdx( ICFKeyHash256 ScopeId );

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
	void deleteBoolColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The BoolCol key attribute of the instance generating the id.
	 */
	void deleteBoolColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtBoolColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtBoolColObj refreshed cache instance.
	 */
	IBusModelProtBoolColObj moveUpBoolCol( IBusModelProtBoolColObj Obj );

	/**
	 *	Move the IBusModelProtBoolColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtBoolColObj refreshed cache instance.
	 */
	IBusModelProtBoolColObj moveDownBoolCol( IBusModelProtBoolColObj Obj );
}
