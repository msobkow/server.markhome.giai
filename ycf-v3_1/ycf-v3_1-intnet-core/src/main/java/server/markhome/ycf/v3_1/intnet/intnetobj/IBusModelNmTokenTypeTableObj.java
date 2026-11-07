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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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

public interface IBusModelNmTokenTypeTableObj
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
	 *	Instantiate a new NmTokenType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNmTokenTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokenType edition of the specified NmTokenType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNmTokenTypeEditObj newEditInstance( IBusModelNmTokenTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokenTypeObj realiseNmTokenType( IBusModelNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokenTypeObj createNmTokenType( IBusModelNmTokenTypeObj Obj );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NmTokenType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokenType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNmTokenTypeObj readCachedNmTokenType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNmTokenType( IBusModelNmTokenTypeObj obj );

	void deepDisposeNmTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokenTypeObj lockNmTokenType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readAllNmTokenType();

	/**
	 *	Return a sorted map of all the NmTokenType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokenTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readAllNmTokenType( boolean forceRead );

	List<IBusModelNmTokenTypeObj> readCachedAllNmTokenType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokenTypeObj readNmTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelNmTokenTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokenTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokenTypeObj> readNmTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelNmTokenTypeObj readCachedNmTokenTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelNmTokenTypeObj readCachedNmTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelNmTokenTypeObj> readCachedNmTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeNmTokenTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNmTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNmTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNmTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNmTokenTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNmTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNmTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNmTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokenTypeObj updateNmTokenType( IBusModelNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokenType( IBusModelNmTokenTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokenType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The NmTokenType key attribute of the instance generating the id.
	 */
	void deleteNmTokenTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelNmTokenTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokenTypeObj refreshed cache instance.
	 */
	IBusModelNmTokenTypeObj moveUpNmTokenType( IBusModelNmTokenTypeObj Obj );

	/**
	 *	Move the BusModelNmTokenTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokenTypeObj refreshed cache instance.
	 */
	IBusModelNmTokenTypeObj moveDownNmTokenType( IBusModelNmTokenTypeObj Obj );
}
