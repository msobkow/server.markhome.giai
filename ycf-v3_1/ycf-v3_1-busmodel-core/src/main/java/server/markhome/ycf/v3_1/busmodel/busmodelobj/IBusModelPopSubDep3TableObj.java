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

public interface IBusModelPopSubDep3TableObj
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
	 *	Instantiate a new PopSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPopSubDep3Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep3 edition of the specified PopSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPopSubDep3EditObj newEditInstance( IBusModelPopSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep3Obj realisePopSubDep3( IBusModelPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep3Obj createPopSubDep3( IBusModelPopSubDep3Obj Obj );

	/**
	 *	Read a PopSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a PopSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelPopSubDep3Obj readCachedPopSubDep3( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposePopSubDep3( IBusModelPopSubDep3Obj obj );

	void deepDisposePopSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep3Obj lockPopSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the PopSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readAllPopSubDep3();

	/**
	 *	Return a sorted map of all the PopSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readAllPopSubDep3( boolean forceRead );

	List<IBusModelPopSubDep3Obj> readCachedAllPopSubDep3();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3ByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPopSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPopSubDep3Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByRelationIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPopSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopSubDep3Obj instances sorted by their primary keys for the duplicate PopSubDep2Idx key.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate PopSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( ICFKeyHash256 PopSubDep2Id );

	/**
	 *	Get the map of BusModelPopSubDep3Obj instances sorted by their primary keys for the duplicate PopSubDep2Idx key.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep3Obj cached instances sorted by their primary keys for the duplicate PopSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep3Obj> readPopSubDep3ByPopSubDep2Idx( ICFKeyHash256 PopSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPopSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3ByUNameIdx(ICFKeyHash256 PopSubDep2Id,
		String Name );

	/**
	 *	Get the BusModelPopSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep3Obj readPopSubDep3ByUNameIdx(ICFKeyHash256 PopSubDep2Id,
		String Name,
		boolean forceRead );

	IBusModelPopSubDep3Obj readCachedPopSubDep3ByIdIdx( ICFKeyHash256 Id );

	List<IBusModelPopSubDep3Obj> readCachedPopSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelPopSubDep3Obj> readCachedPopSubDep3ByRelationIdx( ICFKeyHash256 RelationId );

	List<IBusModelPopSubDep3Obj> readCachedPopSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelPopSubDep3Obj> readCachedPopSubDep3ByPopSubDep2Idx( ICFKeyHash256 PopSubDep2Id );

	IBusModelPopSubDep3Obj readCachedPopSubDep3ByUNameIdx( ICFKeyHash256 PopSubDep2Id,
		String Name );

	void deepDisposePopSubDep3ByIdIdx( ICFKeyHash256 Id );

	void deepDisposePopSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposePopSubDep3ByRelationIdx( ICFKeyHash256 RelationId );

	void deepDisposePopSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposePopSubDep3ByPopSubDep2Idx( ICFKeyHash256 PopSubDep2Id );

	void deepDisposePopSubDep3ByUNameIdx( ICFKeyHash256 PopSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep3Obj updatePopSubDep3( IBusModelPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep3( IBusModelPopSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByPopSubDep2Idx( ICFKeyHash256 PopSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopSubDep2Id	The PopSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep3 key attribute of the instance generating the id.
	 */
	void deletePopSubDep3ByUNameIdx(ICFKeyHash256 PopSubDep2Id,
		String Name );
}
