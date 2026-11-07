// Description: Java 25 Public Table Object interface for BusModelPub.

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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubPopTopDepTableObj
{
	public IBusModelPubSchemaObj getSchema();
	public void setSchema( IBusModelPubSchemaObj value );

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
	 *	Instantiate a new PopTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubPopTopDepObj newInstance();

	/**
	 *	Instantiate a new PopTopDep edition of the specified PopTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubPopTopDepEditObj newEditInstance( IBusModelPubPopTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopTopDepObj realisePopTopDep( IBusModelPubPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopTopDepObj createPopTopDep( IBusModelPubPopTopDepObj Obj );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDep( ICFKeyHash256 pkey );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDep( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubPopTopDepObj readCachedPopTopDep( ICFKeyHash256 pkey );

	public void reallyDeepDisposePopTopDep( IBusModelPubPopTopDepObj obj );

	void deepDisposePopTopDep( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopTopDepObj lockPopTopDep( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readAllPopTopDep();

	/**
	 *	Return a sorted map of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readAllPopTopDep( boolean forceRead );

	List<IBusModelPubPopTopDepObj> readCachedAllPopTopDep();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDepByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubPopTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByRelationIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPubPopTopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByRelationIdx( CFDbKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubPopTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByContRelIdx( CFDbKeyHash256 ContRelationId );

	/**
	 *	Get the map of BusModelPubPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubPopTopDepObj> readPopTopDepByContRelIdx( CFDbKeyHash256 ContRelationId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubPopTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDepByUNameIdx(CFDbKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Get the BusModelPubPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubPopTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubPopTopDepObj readPopTopDepByUNameIdx(CFDbKeyHash256 ContRelationId,
		String Name,
		boolean forceRead );

	IBusModelPubPopTopDepObj readCachedPopTopDepByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubPopTopDepObj> readCachedPopTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubPopTopDepObj> readCachedPopTopDepByRelationIdx( CFDbKeyHash256 RelationId );

	List<IBusModelPubPopTopDepObj> readCachedPopTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubPopTopDepObj> readCachedPopTopDepByContRelIdx( CFDbKeyHash256 ContRelationId );

	IBusModelPubPopTopDepObj readCachedPopTopDepByUNameIdx( CFDbKeyHash256 ContRelationId,
		String Name );

	void deepDisposePopTopDepByIdIdx( CFDbKeyHash256 Id );

	void deepDisposePopTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposePopTopDepByRelationIdx( CFDbKeyHash256 RelationId );

	void deepDisposePopTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposePopTopDepByContRelIdx( CFDbKeyHash256 ContRelationId );

	void deepDisposePopTopDepByUNameIdx( CFDbKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPubPopTopDepObj updatePopTopDep( IBusModelPubPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopTopDep( IBusModelPubPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByRelationIdx( CFDbKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByContRelIdx( CFDbKeyHash256 ContRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByUNameIdx(CFDbKeyHash256 ContRelationId,
		String Name );
}
