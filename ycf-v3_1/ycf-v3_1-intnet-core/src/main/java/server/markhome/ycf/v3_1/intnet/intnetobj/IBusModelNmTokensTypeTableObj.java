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

public interface IBusModelNmTokensTypeTableObj
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
	 *	Instantiate a new NmTokensType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNmTokensTypeObj newInstance();

	/**
	 *	Instantiate a new NmTokensType edition of the specified NmTokensType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNmTokensTypeEditObj newEditInstance( IBusModelNmTokensTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensTypeObj realiseNmTokensType( IBusModelNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensTypeObj createNmTokensType( IBusModelNmTokensTypeObj Obj );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NmTokensType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNmTokensTypeObj readCachedNmTokensType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNmTokensType( IBusModelNmTokensTypeObj obj );

	void deepDisposeNmTokensType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensTypeObj lockNmTokensType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readAllNmTokensType();

	/**
	 *	Return a sorted map of all the NmTokensType-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readAllNmTokensType( boolean forceRead );

	List<IBusModelNmTokensTypeObj> readCachedAllNmTokensType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensTypeObj readNmTokensTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelNmTokensTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensTypeObj> readNmTokensTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelNmTokensTypeObj readCachedNmTokensTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelNmTokensTypeObj readCachedNmTokensTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelNmTokensTypeObj> readCachedNmTokensTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeNmTokensTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNmTokensTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNmTokensTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNmTokensTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNmTokensTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNmTokensTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNmTokensTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNmTokensTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensTypeObj updateNmTokensType( IBusModelNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensType( IBusModelNmTokensTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The NmTokensType key attribute of the instance generating the id.
	 */
	void deleteNmTokensTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelNmTokensTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensTypeObj refreshed cache instance.
	 */
	IBusModelNmTokensTypeObj moveUpNmTokensType( IBusModelNmTokensTypeObj Obj );

	/**
	 *	Move the BusModelNmTokensTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensTypeObj refreshed cache instance.
	 */
	IBusModelNmTokensTypeObj moveDownNmTokensType( IBusModelNmTokensTypeObj Obj );
}
