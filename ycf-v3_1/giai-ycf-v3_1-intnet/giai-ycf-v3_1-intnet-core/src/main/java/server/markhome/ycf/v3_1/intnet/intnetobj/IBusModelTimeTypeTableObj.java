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

public interface IBusModelTimeTypeTableObj
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
	 *	Instantiate a new TimeType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTimeTypeObj newInstance();

	/**
	 *	Instantiate a new TimeType edition of the specified TimeType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTimeTypeEditObj newEditInstance( IBusModelTimeTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeTypeObj realiseTimeType( IBusModelTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeTypeObj createTimeType( IBusModelTimeTypeObj Obj );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimeTypeObj readTimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TimeType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimeTypeObj readTimeType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTimeTypeObj readCachedTimeType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTimeType( IBusModelTimeTypeObj obj );

	void deepDisposeTimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeTypeObj lockTimeType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimeTypeObj> readAllTimeType();

	/**
	 *	Return a sorted map of all the TimeType-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimeTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimeTypeObj> readAllTimeType( boolean forceRead );

	List<IBusModelTimeTypeObj> readCachedAllTimeType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeTypeObj readTimeTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeTypeObj readTimeTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeTypeObj readTimeTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeTypeObj readTimeTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelTimeTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeTypeObj> readTimeTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelTimeTypeObj readCachedTimeTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelTimeTypeObj readCachedTimeTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTimeTypeObj> readCachedTimeTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeTimeTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimeTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimeTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTimeTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTimeTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTimeTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTimeTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTimeTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeTypeObj updateTimeType( IBusModelTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeType( IBusModelTimeTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The TimeType key attribute of the instance generating the id.
	 */
	void deleteTimeTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelTimeTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimeTypeObj refreshed cache instance.
	 */
	IBusModelTimeTypeObj moveUpTimeType( IBusModelTimeTypeObj Obj );

	/**
	 *	Move the BusModelTimeTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimeTypeObj refreshed cache instance.
	 */
	IBusModelTimeTypeObj moveDownTimeType( IBusModelTimeTypeObj Obj );
}
