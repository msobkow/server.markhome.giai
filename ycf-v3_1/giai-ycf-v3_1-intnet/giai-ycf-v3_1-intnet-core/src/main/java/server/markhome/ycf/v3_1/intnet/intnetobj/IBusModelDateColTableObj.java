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

public interface IBusModelDateColTableObj
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
	 *	Instantiate a new DateCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDateColObj newInstance();

	/**
	 *	Instantiate a new DateCol edition of the specified DateCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDateColEditObj newEditInstance( IBusModelDateColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDateColObj realiseDateCol( IBusModelDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDateColObj createDateCol( IBusModelDateColObj Obj );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateColObj readDateCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DateCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateColObj readDateCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDateColObj readCachedDateCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDateCol( IBusModelDateColObj obj );

	void deepDisposeDateCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDateColObj lockDateCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateColObj> readAllDateCol();

	/**
	 *	Return a sorted map of all the DateCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateColObj> readAllDateCol( boolean forceRead );

	List<IBusModelDateColObj> readCachedAllDateCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateColObj readDateColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateColObj readDateColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateColObj readDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateColObj readDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelDateColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateColObj> readDateColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelDateColObj readCachedDateColByIdIdx( ICFKeyHash256 Id );

	IBusModelDateColObj readCachedDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelDateColObj> readCachedDateColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelDateColObj> readCachedDateColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDateColObj> readCachedDateColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelDateColObj> readCachedDateColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelDateColObj> readCachedDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelDateColObj> readCachedDateColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelDateColObj> readCachedDateColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeDateColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDateColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDateColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeDateColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeDateColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelDateColObj updateDateCol( IBusModelDateColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateCol( IBusModelDateColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DateCol key attribute of the instance generating the id.
	 */
	void deleteDateColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelDateColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateColObj refreshed cache instance.
	 */
	IBusModelDateColObj moveUpDateCol( IBusModelDateColObj Obj );

	/**
	 *	Move the BusModelDateColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateColObj refreshed cache instance.
	 */
	IBusModelDateColObj moveDownDateCol( IBusModelDateColObj Obj );
}
