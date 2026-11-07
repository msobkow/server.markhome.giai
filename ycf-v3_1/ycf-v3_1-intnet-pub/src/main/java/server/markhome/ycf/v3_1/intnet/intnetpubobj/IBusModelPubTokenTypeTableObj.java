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

public interface IBusModelPubTokenTypeTableObj
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
	 *	Instantiate a new TokenType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTokenTypeObj newInstance();

	/**
	 *	Instantiate a new TokenType edition of the specified TokenType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTokenTypeEditObj newEditInstance( IBusModelPubTokenTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenTypeObj realiseTokenType( IBusModelPubTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenTypeObj createTokenType( IBusModelPubTokenTypeObj Obj );

	/**
	 *	Read a TokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTokenTypeObj readTokenType( ICFKeyHash256 pkey );

	/**
	 *	Read a TokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTokenTypeObj readTokenType( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTokenTypeObj readCachedTokenType( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTokenType( IBusModelPubTokenTypeObj obj );

	void deepDisposeTokenType( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenTypeObj lockTokenType( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readAllTokenType();

	/**
	 *	Return a sorted map of all the TokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readAllTokenType( boolean forceRead );

	List<IBusModelPubTokenTypeObj> readCachedAllTokenType();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenTypeObj readTokenTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenTypeObj readTokenTypeByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenTypeObj readTokenTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTokenTypeObj readTokenTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelPubTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTokenTypeObj> readTokenTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelPubTokenTypeObj readCachedTokenTypeByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTokenTypeObj readCachedTokenTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubTokenTypeObj> readCachedTokenTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	void deepDisposeTokenTypeByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTokenTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTokenTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTokenTypeByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeTokenTypeByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeTokenTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeTokenTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeTokenTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTokenTypeObj updateTokenType( IBusModelPubTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenType( IBusModelPubTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeBySchemaIdx( CFDbKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelPubTokenTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTokenTypeObj refreshed cache instance.
	 */
	IBusModelPubTokenTypeObj moveUpTokenType( IBusModelPubTokenTypeObj Obj );

	/**
	 *	Move the BusModelPubTokenTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubTokenTypeObj refreshed cache instance.
	 */
	IBusModelPubTokenTypeObj moveDownTokenType( IBusModelPubTokenTypeObj Obj );
}
