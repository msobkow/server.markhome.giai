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

public interface IBusModelPubTextColTableObj
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
	 *	Instantiate a new TextCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTextColObj newInstance();

	/**
	 *	Instantiate a new TextCol edition of the specified TextCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTextColEditObj newEditInstance( IBusModelPubTextColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTextColObj realiseTextCol( IBusModelPubTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTextColObj createTextCol( IBusModelPubTextColObj Obj );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTextColObj readTextCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTextColObj readTextCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTextColObj readCachedTextCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTextCol( IBusModelPubTextColObj obj );

	void deepDisposeTextCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTextColObj lockTextCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTextColObj> readAllTextCol();

	/**
	 *	Return a sorted map of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTextColObj> readAllTextCol( boolean forceRead );

	List<IBusModelPubTextColObj> readCachedAllTextCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTextColObj readTextColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTextColObj readTextColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTextColObj readTextColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTextColObj readTextColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTextColObj> readTextColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubTextColObj readCachedTextColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTextColObj readCachedTextColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTextColObj> readCachedTextColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTextColObj> readCachedTextColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTextColObj> readCachedTextColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTextColObj> readCachedTextColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTextColObj> readCachedTextColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTextColObj> readCachedTextColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTextColObj> readCachedTextColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTextColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTextColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTextColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTextColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTextColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTextColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTextColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTextColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTextColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTextColObj updateTextCol( IBusModelPubTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextCol( IBusModelPubTextColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubTextColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTextColObj refreshed cache instance.
	 */
	IBusModelPubTextColObj moveUpTextCol( IBusModelPubTextColObj Obj );

	/**
	 *	Move the BusModelPubTextColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTextColObj refreshed cache instance.
	 */
	IBusModelPubTextColObj moveDownTextCol( IBusModelPubTextColObj Obj );
}
