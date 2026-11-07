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

public interface IBusModelClearSubDep3TableObj
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
	 *	Instantiate a new ClearSubDep3 instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelClearSubDep3Obj newInstance();

	/**
	 *	Instantiate a new ClearSubDep3 edition of the specified ClearSubDep3 instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelClearSubDep3EditObj newEditInstance( IBusModelClearSubDep3Obj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelClearSubDep3Obj realiseClearSubDep3( IBusModelClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelClearSubDep3Obj createClearSubDep3( IBusModelClearSubDep3Obj Obj );

	/**
	 *	Read a ClearSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a ClearSubDep3-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The ClearSubDep3-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelClearSubDep3Obj readCachedClearSubDep3( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeClearSubDep3( IBusModelClearSubDep3Obj obj );

	void deepDisposeClearSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelClearSubDep3Obj lockClearSubDep3( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the ClearSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelClearSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readAllClearSubDep3();

	/**
	 *	Return a sorted map of all the ClearSubDep3-derived instances in the database.
	 *
	 *	@return	List of IBusModelClearSubDep3Obj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readAllClearSubDep3( boolean forceRead );

	List<IBusModelClearSubDep3Obj> readCachedAllClearSubDep3();

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3ByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelClearSubDep3Obj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearDepObj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Get the map of BusModelClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearDepIdx key.
	 *
	 *	@param	RelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearDepIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByClearDepIdx( ICFKeyHash256 RelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearDepObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelClearSubDep3Obj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearSubDep2Idx key.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( ICFKeyHash256 ClearSubDep2Id );

	/**
	 *	Get the map of BusModelClearSubDep3Obj instances sorted by their primary keys for the duplicate ClearSubDep2Idx key.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelClearSubDep3Obj cached instances sorted by their primary keys for the duplicate ClearSubDep2Idx key,
	 *		which may be an empty set.
	 */
	List<IBusModelClearSubDep3Obj> readClearSubDep3ByClearSubDep2Idx( ICFKeyHash256 ClearSubDep2Id,
		boolean forceRead );

	/**
	 *	Get the BusModelClearSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelClearSubDep3Obj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3ByUNameIdx(ICFKeyHash256 ClearSubDep2Id,
		String Name );

	/**
	 *	Get the BusModelClearSubDep3Obj instance for the unique UNameIdx key.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return	BusModelClearSubDep3Obj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelClearSubDep3Obj readClearSubDep3ByUNameIdx(ICFKeyHash256 ClearSubDep2Id,
		String Name,
		boolean forceRead );

	IBusModelClearSubDep3Obj readCachedClearSubDep3ByIdIdx( ICFKeyHash256 Id );

	List<IBusModelClearSubDep3Obj> readCachedClearSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	List<IBusModelClearSubDep3Obj> readCachedClearSubDep3ByClearDepIdx( ICFKeyHash256 RelationId );

	List<IBusModelClearSubDep3Obj> readCachedClearSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelClearSubDep3Obj> readCachedClearSubDep3ByClearSubDep2Idx( ICFKeyHash256 ClearSubDep2Id );

	IBusModelClearSubDep3Obj readCachedClearSubDep3ByUNameIdx( ICFKeyHash256 ClearSubDep2Id,
		String Name );

	void deepDisposeClearSubDep3ByIdIdx( ICFKeyHash256 Id );

	void deepDisposeClearSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeClearSubDep3ByClearDepIdx( ICFKeyHash256 RelationId );

	void deepDisposeClearSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeClearSubDep3ByClearSubDep2Idx( ICFKeyHash256 ClearSubDep2Id );

	void deepDisposeClearSubDep3ByUNameIdx( ICFKeyHash256 ClearSubDep2Id,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelClearSubDep3Obj updateClearSubDep3( IBusModelClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteClearSubDep3( IBusModelClearSubDep3Obj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	RelationId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByClearDepIdx( ICFKeyHash256 RelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByClearSubDep2Idx( ICFKeyHash256 ClearSubDep2Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ClearSubDep2Id	The ClearSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The ClearSubDep3 key attribute of the instance generating the id.
	 */
	void deleteClearSubDep3ByUNameIdx(ICFKeyHash256 ClearSubDep2Id,
		String Name );
}
