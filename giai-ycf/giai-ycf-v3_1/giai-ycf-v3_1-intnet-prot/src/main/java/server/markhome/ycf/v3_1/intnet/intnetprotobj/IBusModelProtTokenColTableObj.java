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

public interface IBusModelProtTokenColTableObj
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
	 *	Instantiate a new TokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTokenColObj newInstance();

	/**
	 *	Instantiate a new TokenCol edition of the specified TokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTokenColEditObj newEditInstance( IBusModelProtTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTokenColObj realiseTokenCol( IBusModelProtTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTokenColObj createTokenCol( IBusModelProtTokenColObj Obj );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTokenColObj readTokenCol( CFDbKeyHash256 pkey );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTokenColObj readTokenCol( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTokenColObj readCachedTokenCol( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTokenCol( IBusModelProtTokenColObj obj );

	void deepDisposeTokenCol( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTokenColObj lockTokenCol( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTokenColObj> readAllTokenCol();

	/**
	 *	Return a sorted map of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTokenColObj> readAllTokenCol( boolean forceRead );

	List<IBusModelProtTokenColObj> readCachedAllTokenCol();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTokenColObj readTokenColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTokenColObj readTokenColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTokenColObj readTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTokenColObj readTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTokenColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTokenColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtTokenColObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTokenColObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTokenColObj> readTokenColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtValueObj readCachedTokenColByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTokenColByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<List<IBusModelProtTokenColObj>> readCachedTokenColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTokenColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTokenColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTokenColObj updateTokenCol( IBusModelProtTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenCol( IBusModelProtTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the IBusModelProtTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTokenColObj refreshed cache instance.
	 */
	IBusModelProtTokenColObj moveUpTokenCol( IBusModelProtTokenColObj Obj );

	/**
	 *	Move the IBusModelProtTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtTokenColObj refreshed cache instance.
	 */
	IBusModelProtTokenColObj moveDownTokenCol( IBusModelProtTokenColObj Obj );
}
