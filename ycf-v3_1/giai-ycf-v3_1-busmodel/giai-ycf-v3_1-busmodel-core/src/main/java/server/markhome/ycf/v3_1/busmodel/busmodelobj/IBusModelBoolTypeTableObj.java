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

public interface IBusModelBoolTypeTableObj
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
	 *	Instantiate a new BoolType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelBoolTypeObj newInstance();

	/**
	 *	Instantiate a new BoolType edition of the specified BoolType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelBoolTypeEditObj newEditInstance( IBusModelBoolTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolTypeObj realiseBoolType( IBusModelBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolTypeObj createBoolType( IBusModelBoolTypeObj Obj );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelBoolTypeObj readBoolType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a BoolType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelBoolTypeObj readBoolType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelBoolTypeObj readCachedBoolType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeBoolType( IBusModelBoolTypeObj obj );

	void deepDisposeBoolType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolTypeObj lockBoolType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IBusModelBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelBoolTypeObj> readAllBoolType();

	/**
	 *	Return a sorted map of all the BoolType-derived instances in the database.
	 *
	 *	@return	List of IBusModelBoolTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelBoolTypeObj> readAllBoolType( boolean forceRead );

	List<IBusModelBoolTypeObj> readCachedAllBoolType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolTypeObj readBoolTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolTypeObj readBoolTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolTypeObj readBoolTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolTypeObj readBoolTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelBoolTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolTypeObj> readBoolTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelBoolTypeObj readCachedBoolTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelBoolTypeObj readCachedBoolTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelBoolTypeObj> readCachedBoolTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeBoolTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeBoolTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeBoolTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeBoolTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeBoolTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeBoolTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeBoolTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeBoolTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolTypeObj updateBoolType( IBusModelBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolType( IBusModelBoolTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The BoolType key attribute of the instance generating the id.
	 */
	void deleteBoolTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelBoolTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelBoolTypeObj refreshed cache instance.
	 */
	IBusModelBoolTypeObj moveUpBoolType( IBusModelBoolTypeObj Obj );

	/**
	 *	Move the BusModelBoolTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelBoolTypeObj refreshed cache instance.
	 */
	IBusModelBoolTypeObj moveDownBoolType( IBusModelBoolTypeObj Obj );
}
