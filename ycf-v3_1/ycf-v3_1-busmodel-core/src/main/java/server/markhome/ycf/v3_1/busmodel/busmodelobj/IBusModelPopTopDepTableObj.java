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

public interface IBusModelPopTopDepTableObj
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
	 *	Instantiate a new PopTopDep instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPopTopDepObj newInstance();

	/**
	 *	Instantiate a new PopTopDep edition of the specified PopTopDep instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPopTopDepEditObj newEditInstance( IBusModelPopTopDepObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPopTopDepObj realisePopTopDep( IBusModelPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPopTopDepObj createPopTopDep( IBusModelPopTopDepObj Obj );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopTopDepObj readPopTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a PopTopDep-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The PopTopDep-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPopTopDepObj readPopTopDep( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelPopTopDepObj readCachedPopTopDep( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposePopTopDep( IBusModelPopTopDepObj obj );

	void deepDisposePopTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPopTopDepObj lockPopTopDep( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopTopDepObj> readAllPopTopDep();

	/**
	 *	Return a sorted map of all the PopTopDep-derived instances in the database.
	 *
	 *	@return	List of IBusModelPopTopDepObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPopTopDepObj> readAllPopTopDep( boolean forceRead );

	List<IBusModelPopTopDepObj> readCachedAllPopTopDep();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopTopDepObj readPopTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopTopDepObj readPopTopDepByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPopTopDepObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelPopTopDepObj instances sorted by their primary keys for the duplicate RelationIdx key.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate RelationIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByRelationIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPopTopDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByContRelIdx( ICFKeyHash256 ContRelationId );

	/**
	 *	Get the map of BusModelPopTopDepObj instances sorted by their primary keys for the duplicate ContRelIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPopTopDepObj cached instances sorted by their primary keys for the duplicate ContRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPopTopDepObj> readPopTopDepByContRelIdx( ICFKeyHash256 ContRelationId,
		boolean forceRead );

	/**
	 *	Get the BusModelPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopTopDepObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopTopDepObj readPopTopDepByUNameIdx(ICFKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Get the BusModelPopTopDepObj instance for the unique UNameIdx key.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPopTopDepObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPopTopDepObj readPopTopDepByUNameIdx(ICFKeyHash256 ContRelationId,
		String Name,
		boolean forceRead );

	IBusModelPopTopDepObj readCachedPopTopDepByIdIdx( ICFKeyHash256 Id );

	List<IBusModelPopTopDepObj> readCachedPopTopDepByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelPopTopDepObj> readCachedPopTopDepByRelationIdx( ICFKeyHash256 RelationId );

	List<IBusModelPopTopDepObj> readCachedPopTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelPopTopDepObj> readCachedPopTopDepByContRelIdx( ICFKeyHash256 ContRelationId );

	IBusModelPopTopDepObj readCachedPopTopDepByUNameIdx( ICFKeyHash256 ContRelationId,
		String Name );

	void deepDisposePopTopDepByIdIdx( ICFKeyHash256 Id );

	void deepDisposePopTopDepByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposePopTopDepByRelationIdx( ICFKeyHash256 RelationId );

	void deepDisposePopTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposePopTopDepByContRelIdx( ICFKeyHash256 ContRelationId );

	void deepDisposePopTopDepByUNameIdx( ICFKeyHash256 ContRelationId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPopTopDepObj updatePopTopDep( IBusModelPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 */
	void deletePopTopDep( IBusModelPopTopDepObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByRelationIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByContRelIdx( ICFKeyHash256 ContRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ContRelationId	The PopTopDep key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopTopDep key attribute of the instance generating the id.
	 */
	void deletePopTopDepByUNameIdx(ICFKeyHash256 ContRelationId,
		String Name );
}
