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

public interface IBusModelPubDateColTableObj
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
	 *	Instantiate a new DateCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDateColObj newInstance();

	/**
	 *	Instantiate a new DateCol edition of the specified DateCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDateColEditObj newEditInstance( IBusModelPubDateColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateColObj realiseDateCol( IBusModelPubDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateColObj createDateCol( IBusModelPubDateColObj Obj );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDateColObj readDateCol( ICFKeyHash256 pkey );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDateColObj readDateCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDateColObj readCachedDateCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDateCol( IBusModelPubDateColObj obj );

	void deepDisposeDateCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateColObj lockDateCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDateColObj> readAllDateCol();

	/**
	 *	Return a sorted map of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDateColObj> readAllDateCol( boolean forceRead );

	List<IBusModelPubDateColObj> readCachedAllDateCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateColObj readDateColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateColObj readDateColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateColObj readDateColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateColObj readDateColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateColObj> readDateColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubDateColObj readCachedDateColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDateColObj readCachedDateColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDateColObj> readCachedDateColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDateColObj> readCachedDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDateColObj> readCachedDateColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDateColObj> readCachedDateColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDateColObj> readCachedDateColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDateColObj> readCachedDateColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubDateColObj> readCachedDateColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeDateColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDateColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDateColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDateColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDateColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDateColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDateColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateColObj updateDateCol( IBusModelPubDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateCol( IBusModelPubDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDateColObj refreshed cache instance.
	 */
	IBusModelPubDateColObj moveUpDateCol( IBusModelPubDateColObj Obj );

	/**
	 *	Move the BusModelPubDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDateColObj refreshed cache instance.
	 */
	IBusModelPubDateColObj moveDownDateCol( IBusModelPubDateColObj Obj );
}
