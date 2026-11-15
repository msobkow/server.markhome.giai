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

public interface IBusModelDelTopDepTableObj
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
	 *	Instantiate a new DelTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDelTopDepObj newInstance();

	/**
	 *	Instantiate a new DelTopDep edition of the specified DelTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDelTopDepEditObj newEditInstance( IBusModelDelTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDelTopDepObj realiseDelTopDep( IBusModelDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDelTopDepObj createDelTopDep( IBusModelDelTopDepObj Obj );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDelTopDepObj readDelTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DelTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDelTopDepObj readDelTopDep( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDelTopDepObj readCachedDelTopDep( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDelTopDep( IBusModelDelTopDepObj obj );

	void deepDisposeDelTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDelTopDepObj lockDelTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDelTopDepObj> readAllDelTopDep();

	/**
	 *	Return a sorted map of all the DelTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelDelTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDelTopDepObj> readAllDelTopDep( boolean forceRead );

	List<IBusModelDelTopDepObj> readCachedAllDelTopDep();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelTopDepObj readDelTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelTopDepObj readDelTopDepByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDelDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDelDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDelTopDepTblIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate DelTopDepTblIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate DelTopDepTblIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByDelTopDepTblIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the BusModelDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelDelTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelTopDepObj readDelTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelDelTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelDelTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelTopDepObj readDelTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDelTopDepObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelTopDepObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelTopDepObj> readDelTopDepByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelDelTopDepObj readCachedDelTopDepByIdIdx( ICFKeyHash256 Id );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByDelDepIdx( ICFKeyHash256 RelationId );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByDelTopDepTblIdx( ICFKeyHash256 TableId );

	IBusModelDelTopDepObj readCachedDelTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelDelTopDepObj> readCachedDelTopDepByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeDelTopDepByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDelTopDepByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeDelTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDelTopDepByDelDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeDelTopDepByDelTopDepTblIdx( ICFKeyHash256 TableId );

	void deepDisposeDelTopDepByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeDelTopDepByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeDelTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelDelTopDepObj updateDelTopDep( IBusModelDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelTopDep( IBusModelDelTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByDelTopDepTblIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The DelTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DelTopDep key attribute of the instance generating the id.
	 */
	void deleteDelTopDepByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelDelTopDepObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDelTopDepObj refreshed cache instance.
	 */
	IBusModelDelTopDepObj moveUpDelTopDep( IBusModelDelTopDepObj Obj );

	/**
	 *	Move the BusModelDelTopDepObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDelTopDepObj refreshed cache instance.
	 */
	IBusModelDelTopDepObj moveDownDelTopDep( IBusModelDelTopDepObj Obj );
}
