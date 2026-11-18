// Description: Java 25 Protected Table Object interface for BusModelProt.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtPopSubDep1TableObj
{
	public IBusModelProtSchemaObj getSchema();
	public void setSchema( IBusModelProtSchemaObj value );

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
	 *	Instantiate a new PopSubDep1 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtPopSubDep1Obj newInstance();

	/**
	 *	Instantiate a new PopSubDep1 edition of the specified PopSubDep1 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtPopSubDep1EditObj newEditInstance( IBusModelProtPopSubDep1Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtPopSubDep1Obj realisePopSubDep1( IBusModelProtPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtPopSubDep1Obj createPopSubDep1( IBusModelProtPopSubDep1Obj Obj );

	/**
	 *	Read a PopSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1( CFDbKeyHash256 pkey );

	/**
	 *	Read a PopSubDep1-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopSubDep1-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtPopSubDep1Obj readCachedPopSubDep1( CFDbKeyHash256 pkey );

	public void reallyDeepDisposePopSubDep1( IBusModelProtPopSubDep1Obj obj );

	void deepDisposePopSubDep1( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtPopSubDep1Obj lockPopSubDep1( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the PopSubDep1-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readAllPopSubDep1();

	/**
	 *	Return a sorted map of all the PopSubDep1-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readAllPopSubDep1( boolean forceRead );

	List<IBusModelProtPopSubDep1Obj> readCachedAllPopSubDep1();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1ByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByRelationIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtPopSubDep1Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtPopSubDep1Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtPopSubDep1Obj> instances sorted by their primary keys for the duplicate PopTopDepIdx key.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtPopSubDep1Obj> cached instances sorted by their primary keys for the duplicate PopTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( ICFKeyHash256 PopTopDepId );

	/**
	 *	Get the map of List<IBusModelProtPopSubDep1Obj> instances sorted by their primary keys for the duplicate PopTopDepIdx key.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtPopSubDep1Obj> cached instances sorted by their primary keys for the duplicate PopTopDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtPopSubDep1Obj> readPopSubDep1ByPopTopDepIdx( ICFKeyHash256 PopTopDepId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtPopSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtPopSubDep1Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1ByUNameIdx(ICFKeyHash256 PopTopDepId,
		String Name );

	/**
	 *	Get the IBusModelProtPopSubDep1Obj instance for the unique UNameIdx key.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtPopSubDep1Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtPopSubDep1Obj readPopSubDep1ByUNameIdx(ICFKeyHash256 PopTopDepId,
		String Name,
		boolean forceRead );

	IBusModelProtScopeObj readCachedPopSubDep1ByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedPopSubDep1ByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtPopDepObj>> readCachedPopSubDep1ByRelationIdx( ICFKeyHash256 RelationId );

	List<List<IBusModelProtPopDepObj>> readCachedPopSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtPopSubDep1Obj>> readCachedPopSubDep1ByPopTopDepIdx( ICFKeyHash256 PopTopDepId );

	IBusModelProtPopSubDep1Obj readCachedPopSubDep1ByUNameIdx( ICFKeyHash256 PopTopDepId,
		String Name );

	void deepDisposePopSubDep1ByIdIdx( ICFKeyHash256 Id );

	void deepDisposePopSubDep1ByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposePopSubDep1ByRelationIdx( ICFKeyHash256 RelationId );

	void deepDisposePopSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposePopSubDep1ByPopTopDepIdx( ICFKeyHash256 PopTopDepId );

	void deepDisposePopSubDep1ByUNameIdx( ICFKeyHash256 PopTopDepId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelProtPopSubDep1Obj updatePopSubDep1( IBusModelProtPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopSubDep1( IBusModelProtPopSubDep1Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByPopTopDepIdx( ICFKeyHash256 PopTopDepId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 */
	void deletePopSubDep1ByUNameIdx(ICFKeyHash256 PopTopDepId,
		String Name );
}
