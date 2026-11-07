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

public interface IBusModelPubTableColTableObj
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
	 *	Instantiate a new TableCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTableColObj newInstance();

	/**
	 *	Instantiate a new TableCol edition of the specified TableCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTableColEditObj newEditInstance( IBusModelPubTableColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTableColObj realiseTableCol( IBusModelPubTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTableColObj createTableCol( IBusModelPubTableColObj Obj );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTableColObj readTableCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTableColObj readTableCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTableColObj readCachedTableCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTableCol( IBusModelPubTableColObj obj );

	void deepDisposeTableCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTableColObj lockTableCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTableColObj> readAllTableCol();

	/**
	 *	Return a sorted map of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTableColObj> readAllTableCol( boolean forceRead );

	List<IBusModelPubTableColObj> readCachedAllTableCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTableColObj readTableColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTableColObj readTableColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTableColObj readTableColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTableColObj readTableColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Get the map of BusModelPubTableColObj instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTableColObj cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTableColObj> readTableColByDataIdx( CFDbKeyHash256 DataId,
		boolean forceRead );

	IBusModelPubTableColObj readCachedTableColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTableColObj readCachedTableColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTableColObj> readCachedTableColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTableColObj> readCachedTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTableColObj> readCachedTableColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTableColObj> readCachedTableColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTableColObj> readCachedTableColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTableColObj> readCachedTableColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTableColObj> readCachedTableColByTableIdx( CFDbKeyHash256 TableId );

	List<IBusModelPubTableColObj> readCachedTableColByDataIdx( CFDbKeyHash256 DataId );

	void deepDisposeTableColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTableColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTableColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTableColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTableColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTableColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTableColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTableColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTableColObj updateTableCol( IBusModelPubTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableCol( IBusModelPubTableColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Move the BusModelPubTableColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTableColObj refreshed cache instance.
	 */
	IBusModelPubTableColObj moveUpTableCol( IBusModelPubTableColObj Obj );

	/**
	 *	Move the BusModelPubTableColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTableColObj refreshed cache instance.
	 */
	IBusModelPubTableColObj moveDownTableCol( IBusModelPubTableColObj Obj );
}
