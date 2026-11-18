// Description: Java 25 Table Object interface for BusModel.

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

package server.markhome.ycf.v3_1.busmodel.busmodelobj;

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
import server.markhome.ycf.v3_1.busmodel.busmodel.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

public interface IBusModelTokenTypeTableObj
{
	public IBusModelSchemaObj getSchema();
	public void setSchema( IBusModelSchemaObj value );

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
	IBusModelTokenTypeObj newInstance();

	/**
	 *	Instantiate a new TokenType edition of the specified TokenType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTokenTypeEditObj newEditInstance( IBusModelTokenTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenTypeObj realiseTokenType( IBusModelTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenTypeObj createTokenType( IBusModelTokenTypeObj Obj );

	/**
	 *	Read a TokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTokenTypeObj readTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTokenTypeObj readTokenType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTokenTypeObj readCachedTokenType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTokenType( IBusModelTokenTypeObj obj );

	void deepDisposeTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenTypeObj lockTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTokenTypeObj> readAllTokenType();

	/**
	 *	Return a sorted map of all the TokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTokenTypeObj> readAllTokenType( boolean forceRead );

	List<IBusModelTokenTypeObj> readCachedAllTokenType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenTypeObj readTokenTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenTypeObj readTokenTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenTypeObj readTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenTypeObj readTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenTypeObj> readTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelTokenTypeObj readCachedTokenTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelTokenTypeObj readCachedTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTokenTypeObj> readCachedTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTokenTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTokenTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenTypeObj updateTokenType( IBusModelTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenType( IBusModelTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TokenType key attribute of the instance generating the id.
	 */
	void deleteTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelTokenTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTokenTypeObj refreshed cache instance.
	 */
	IBusModelTokenTypeObj moveUpTokenType( IBusModelTokenTypeObj Obj );

	/**
	 *	Move the BusModelTokenTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTokenTypeObj refreshed cache instance.
	 */
	IBusModelTokenTypeObj moveDownTokenType( IBusModelTokenTypeObj Obj );
}
