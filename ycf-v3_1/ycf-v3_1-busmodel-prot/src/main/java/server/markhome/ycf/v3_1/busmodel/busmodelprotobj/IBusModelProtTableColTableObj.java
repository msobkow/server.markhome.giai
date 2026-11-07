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

public interface IBusModelProtTableColTableObj
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
	 *	Instantiate a new TableCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTableColObj newInstance();

	/**
	 *	Instantiate a new TableCol edition of the specified TableCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTableColEditObj newEditInstance( IBusModelProtTableColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableColObj realiseTableCol( IBusModelProtTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableColObj createTableCol( IBusModelProtTableColObj Obj );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableColObj readTableCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableColObj readTableCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTableColObj readCachedTableCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTableCol( IBusModelProtTableColObj obj );

	void deepDisposeTableCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableColObj lockTableCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableColObj> readAllTableCol();

	/**
	 *	Return a sorted map of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableColObj> readAllTableCol( boolean forceRead );

	List<IBusModelProtTableColObj> readCachedAllTableCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableColObj readTableColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableColObj readTableColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableColObj readTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableColObj readTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTableColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtTableColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableColObj> instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableColObj> cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Get the map of List<IBusModelProtTableColObj> instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableColObj> cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableColObj> readTableColByDataIdx( CFDbKeyHash256 DataId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTableColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTableColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTableColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTableColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTableColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTableColObj>> readCachedTableColByTableIdx( ICFKeyHash256 TableId );

	List<List<IBusModelProtTableColObj>> readCachedTableColByDataIdx( CFDbKeyHash256 DataId );

	void deepDisposeTableColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTableColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTableColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTableColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTableColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTableColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTableColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableColObj updateTableCol( IBusModelProtTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableCol( IBusModelProtTableColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByScopeIdx( ICFKeyHash256 ScopeId );

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
	void deleteTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByDataIdx( CFDbKeyHash256 DataId );

	/**
	 *	Move the IBusModelProtTableColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTableColObj refreshed cache instance.
	 */
	IBusModelProtTableColObj moveUpTableCol( IBusModelProtTableColObj Obj );

	/**
	 *	Move the IBusModelProtTableColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTableColObj refreshed cache instance.
	 */
	IBusModelProtTableColObj moveDownTableCol( IBusModelProtTableColObj Obj );
}
