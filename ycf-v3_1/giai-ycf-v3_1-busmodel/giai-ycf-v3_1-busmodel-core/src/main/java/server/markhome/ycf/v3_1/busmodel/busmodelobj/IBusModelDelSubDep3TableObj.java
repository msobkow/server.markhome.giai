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

public interface IBusModelDelSubDep3TableObj
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
	 *	Instantiate a new DelSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDelSubDep3Obj newInstance();

	/**
	 *	Instantiate a new DelSubDep3 edition of the specified DelSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDelSubDep3EditObj newEditInstance( IBusModelDelSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDelSubDep3Obj realiseDelSubDep3( IBusModelDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDelSubDep3Obj createDelSubDep3( IBusModelDelSubDep3Obj Obj );

	/**
	 *	Read a DelSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DelSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DelSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDelSubDep3Obj readCachedDelSubDep3( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDelSubDep3( IBusModelDelSubDep3Obj obj );

	void deepDisposeDelSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDelSubDep3Obj lockDelSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DelSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelDelSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readAllDelSubDep3();

	/**
	 *	Return a sorted map of all the DelSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelDelSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readAllDelSubDep3( boolean forceRead );

	List<IBusModelDelSubDep3Obj> readCachedAllDelSubDep3();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3ByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelDelSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDelSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelDepObj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDelDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelDelSubDep3Obj instances sorted by their primary keys for the duplicate DelDepIdx key.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDelDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelDelSubDep3Obj instances sorted by their primary keys for the duplicate DelSubDep2Idx key.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( ICFKeyHash256 DelSubDep2Id );

	/**
	 *	Get the map of BusModelDelSubDep3Obj instances sorted by their primary keys for the duplicate DelSubDep2Idx key.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDelSubDep3Obj cached instances sorted by their primary keys for the duplicate DelSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDelSubDep3Obj> readDelSubDep3ByDelSubDep2Idx( ICFKeyHash256 DelSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the BusModelDelSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelDelSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3ByUNameIdx(ICFKeyHash256 DelSubDep2Id,
		String Name );

	/**
	 *	Get the BusModelDelSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelDelSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDelSubDep3Obj readDelSubDep3ByUNameIdx(ICFKeyHash256 DelSubDep2Id,
		String Name,
		boolean forceRead );

	IBusModelDelSubDep3Obj readCachedDelSubDep3ByIdIdx( ICFKeyHash256 Id );

	List<IBusModelDelSubDep3Obj> readCachedDelSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelDelSubDep3Obj> readCachedDelSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDelSubDep3Obj> readCachedDelSubDep3ByDelDepIdx( ICFKeyHash256 RelationId );

	List<IBusModelDelSubDep3Obj> readCachedDelSubDep3ByDelSubDep2Idx( ICFKeyHash256 DelSubDep2Id );

	IBusModelDelSubDep3Obj readCachedDelSubDep3ByUNameIdx( ICFKeyHash256 DelSubDep2Id,
		String Name );

	void deepDisposeDelSubDep3ByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDelSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeDelSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDelSubDep3ByDelDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeDelSubDep3ByDelSubDep2Idx( ICFKeyHash256 DelSubDep2Id );

	void deepDisposeDelSubDep3ByUNameIdx( ICFKeyHash256 DelSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelDelSubDep3Obj updateDelSubDep3( IBusModelDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDelSubDep3( IBusModelDelSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelSubDep2Idx( ICFKeyHash256 DelSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByUNameIdx(ICFKeyHash256 DelSubDep2Id,
		String Name );
}
