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

public interface IBusModelPubTokenColTableObj
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
	 *	Instantiate a new TokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTokenColObj newInstance();

	/**
	 *	Instantiate a new TokenCol edition of the specified TokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTokenColEditObj newEditInstance( IBusModelPubTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenColObj realiseTokenCol( IBusModelPubTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenColObj createTokenCol( IBusModelPubTokenColObj Obj );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTokenColObj readTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTokenColObj readTokenCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTokenColObj readCachedTokenCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTokenCol( IBusModelPubTokenColObj obj );

	void deepDisposeTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenColObj lockTokenCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTokenColObj> readAllTokenCol();

	/**
	 *	Return a sorted map of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTokenColObj> readAllTokenCol( boolean forceRead );

	List<IBusModelPubTokenColObj> readCachedAllTokenCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenColObj readTokenColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenColObj readTokenColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenColObj readTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenColObj readTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenColObj> readTokenColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubTokenColObj readCachedTokenColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTokenColObj readCachedTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTokenColObj> readCachedTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTokenColObj> readCachedTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTokenColObj> readCachedTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTokenColObj> readCachedTokenColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTokenColObj> readCachedTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTokenColObj> readCachedTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTokenColObj> readCachedTokenColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeTokenColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTokenColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTokenColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTokenColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenColObj updateTokenCol( IBusModelPubTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenCol( IBusModelPubTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeIdx( CFDbKeyHash256 ScopeId );

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
	void deleteTokenColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTokenColObj refreshed cache instance.
	 */
	IBusModelPubTokenColObj moveUpTokenCol( IBusModelPubTokenColObj Obj );

	/**
	 *	Move the BusModelPubTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTokenColObj refreshed cache instance.
	 */
	IBusModelPubTokenColObj moveDownTokenCol( IBusModelPubTokenColObj Obj );
}
