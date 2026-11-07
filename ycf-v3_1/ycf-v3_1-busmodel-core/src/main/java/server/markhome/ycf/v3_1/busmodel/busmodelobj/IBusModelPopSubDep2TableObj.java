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

public interface IBusModelPopSubDep2TableObj
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
	 *	Instantiate a new PopSubDep2 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPopSubDep2Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep2 edition of the specified PopSubDep2 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPopSubDep2EditObj newEditInstance( IBusModelPopSubDep2Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep2Obj realisePopSubDep2( IBusModelPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep2Obj createPopSubDep2( IBusModelPopSubDep2Obj Obj );

	/**
	 *	Read a PopSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a PopSubDep2-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep2-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelPopSubDep2Obj readCachedPopSubDep2( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposePopSubDep2( IBusModelPopSubDep2Obj obj );

	void deepDisposePopSubDep2( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep2Obj lockPopSubDep2( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the PopSubDep2-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readAllPopSubDep2();

	/**
	 *	Return a sorted map of all the PopSubDep2-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopSubDep2Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readAllPopSubDep2( boolean forceRead );

	List<IBusModelPopSubDep2Obj> readCachedAllPopSubDep2();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2ByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPopSubDep2Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPopSubDep2Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByRelationIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPopSubDep2Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopSubDep2Obj instances sorted by their primary keys for the duplicate PopSubDep1Idx key.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate PopSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( ICFKeyHash256 PopSubDep1Id );

	/**
	 *	Get the map of BusModelPopSubDep2Obj instances sorted by their primary keys for the duplicate PopSubDep1Idx key.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopSubDep2Obj cached instances sorted by their primary keys for the duplicate PopSubDep1Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopSubDep2Obj> readPopSubDep2ByPopSubDep1Idx( ICFKeyHash256 PopSubDep1Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPopSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopSubDep2Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2ByUNameIdx(ICFKeyHash256 PopSubDep1Id,
		String Name );

	/**
	 *	Get the BusModelPopSubDep2Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopSubDep2Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopSubDep2Obj readPopSubDep2ByUNameIdx(ICFKeyHash256 PopSubDep1Id,
		String Name,
		boolean forceRead );

	IBusModelPopSubDep2Obj readCachedPopSubDep2ByIdIdx( ICFKeyHash256 Id );

	List<IBusModelPopSubDep2Obj> readCachedPopSubDep2ByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelPopSubDep2Obj> readCachedPopSubDep2ByRelationIdx( ICFKeyHash256 RelationId );

	List<IBusModelPopSubDep2Obj> readCachedPopSubDep2ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelPopSubDep2Obj> readCachedPopSubDep2ByPopSubDep1Idx( ICFKeyHash256 PopSubDep1Id );

	IBusModelPopSubDep2Obj readCachedPopSubDep2ByUNameIdx( ICFKeyHash256 PopSubDep1Id,
		String Name );

	void deepDisposePopSubDep2ByIdIdx( ICFKeyHash256 Id );

	void deepDisposePopSubDep2ByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposePopSubDep2ByRelationIdx( ICFKeyHash256 RelationId );

	void deepDisposePopSubDep2ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposePopSubDep2ByPopSubDep1Idx( ICFKeyHash256 PopSubDep1Id );

	void deepDisposePopSubDep2ByUNameIdx( ICFKeyHash256 PopSubDep1Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPopSubDep2Obj updatePopSubDep2( IBusModelPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep2( IBusModelPopSubDep2Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByPopSubDep1Idx( ICFKeyHash256 PopSubDep1Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopSubDep1Id	The PopSubDep2 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep2 key attribute of the instance generating the id.
	 */
	void deletePopSubDep2ByUNameIdx(ICFKeyHash256 PopSubDep1Id,
		String Name );
}
