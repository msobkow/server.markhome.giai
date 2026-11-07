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

public interface IBusModelTZDateTypeTableObj
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
	 *	Instantiate a new TZDateType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTZDateTypeObj newInstance();

	/**
	 *	Instantiate a new TZDateType edition of the specified TZDateType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTZDateTypeEditObj newEditInstance( IBusModelTZDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTZDateTypeObj realiseTZDateType( IBusModelTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTZDateTypeObj createTZDateType( IBusModelTZDateTypeObj Obj );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTZDateTypeObj readTZDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TZDateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZDateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTZDateTypeObj readTZDateType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTZDateTypeObj readCachedTZDateType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTZDateType( IBusModelTZDateTypeObj obj );

	void deepDisposeTZDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTZDateTypeObj lockTZDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTZDateTypeObj> readAllTZDateType();

	/**
	 *	Return a sorted map of all the TZDateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTZDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTZDateTypeObj> readAllTZDateType( boolean forceRead );

	List<IBusModelTZDateTypeObj> readCachedAllTZDateType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZDateTypeObj readTZDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZDateTypeObj readTZDateTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZDateTypeObj readTZDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZDateTypeObj readTZDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelTZDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZDateTypeObj> readTZDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelTZDateTypeObj readCachedTZDateTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelTZDateTypeObj readCachedTZDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTZDateTypeObj> readCachedTZDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTZDateTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTZDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTZDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTZDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTZDateTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTZDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTZDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTZDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelTZDateTypeObj updateTZDateType( IBusModelTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZDateType( IBusModelTZDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZDateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TZDateType key attribute of the instance generating the id.
	 */
	void deleteTZDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelTZDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTZDateTypeObj refreshed cache instance.
	 */
	IBusModelTZDateTypeObj moveUpTZDateType( IBusModelTZDateTypeObj Obj );

	/**
	 *	Move the BusModelTZDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTZDateTypeObj refreshed cache instance.
	 */
	IBusModelTZDateTypeObj moveDownTZDateType( IBusModelTZDateTypeObj Obj );
}
