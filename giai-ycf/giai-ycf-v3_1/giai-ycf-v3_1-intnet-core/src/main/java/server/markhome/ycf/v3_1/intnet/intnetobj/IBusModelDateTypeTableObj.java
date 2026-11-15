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

public interface IBusModelDateTypeTableObj
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
	 *	Instantiate a new DateType instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDateTypeObj newInstance();

	/**
	 *	Instantiate a new DateType edition of the specified DateType instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDateTypeEditObj newEditInstance( IBusModelDateTypeObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDateTypeObj realiseDateType( IBusModelDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDateTypeObj createDateType( IBusModelDateTypeObj Obj );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateTypeObj readDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DateType-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateType-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateTypeObj readDateType( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDateTypeObj readCachedDateType( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDateType( IBusModelDateTypeObj obj );

	void deepDisposeDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDateTypeObj lockDateType( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateTypeObj> readAllDateType();

	/**
	 *	Return a sorted map of all the DateType-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateTypeObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateTypeObj> readAllDateType( boolean forceRead );

	List<IBusModelDateTypeObj> readCachedAllDateType();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateTypeObj readDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateTypeObj readDateTypeByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateTypeObj readDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateTypeObj readDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelDateTypeObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateTypeObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateTypeObj> readDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelDateTypeObj readCachedDateTypeByIdIdx( ICFKeyHash256 Id );

	IBusModelDateTypeObj readCachedDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelDateTypeObj> readCachedDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelDateTypeObj> readCachedDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDateTypeObj> readCachedDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelDateTypeObj> readCachedDateTypeByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelDateTypeObj> readCachedDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelDateTypeObj> readCachedDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelDateTypeObj> readCachedDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeDateTypeByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeDateTypeByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelDateTypeObj updateDateType( IBusModelDateTypeObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateType( IBusModelDateTypeObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The DateType key attribute of the instance generating the id.
	 */
	void deleteDateTypeBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the BusModelDateTypeObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateTypeObj refreshed cache instance.
	 */
	IBusModelDateTypeObj moveUpDateType( IBusModelDateTypeObj Obj );

	/**
	 *	Move the BusModelDateTypeObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateTypeObj refreshed cache instance.
	 */
	IBusModelDateTypeObj moveDownDateType( IBusModelDateTypeObj Obj );
}
