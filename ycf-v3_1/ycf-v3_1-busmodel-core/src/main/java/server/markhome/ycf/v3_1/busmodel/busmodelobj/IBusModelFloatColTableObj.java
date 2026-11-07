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

public interface IBusModelFloatColTableObj
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
	 *	Instantiate a new FloatCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelFloatColObj newInstance();

	/**
	 *	Instantiate a new FloatCol edition of the specified FloatCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelFloatColEditObj newEditInstance( IBusModelFloatColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatColObj realiseFloatCol( IBusModelFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatColObj createFloatCol( IBusModelFloatColObj Obj );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelFloatColObj readFloatCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a FloatCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The FloatCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelFloatColObj readFloatCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelFloatColObj readCachedFloatCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeFloatCol( IBusModelFloatColObj obj );

	void deepDisposeFloatCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatColObj lockFloatCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelFloatColObj> readAllFloatCol();

	/**
	 *	Return a sorted map of all the FloatCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelFloatColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelFloatColObj> readAllFloatCol( boolean forceRead );

	List<IBusModelFloatColObj> readCachedAllFloatCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatColObj readFloatColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatColObj readFloatColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatColObj readFloatColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelFloatColObj readFloatColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelFloatColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelFloatColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelFloatColObj> readFloatColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelFloatColObj readCachedFloatColByIdIdx( ICFKeyHash256 Id );

	IBusModelFloatColObj readCachedFloatColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelFloatColObj> readCachedFloatColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelFloatColObj> readCachedFloatColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelFloatColObj> readCachedFloatColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelFloatColObj> readCachedFloatColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelFloatColObj> readCachedFloatColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelFloatColObj> readCachedFloatColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelFloatColObj> readCachedFloatColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeFloatColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeFloatColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeFloatColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeFloatColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeFloatColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeFloatColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeFloatColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeFloatColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeFloatColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelFloatColObj updateFloatCol( IBusModelFloatColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteFloatCol( IBusModelFloatColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The FloatCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The FloatCol key attribute of the instance generating the id.
	 */
	void deleteFloatColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelFloatColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelFloatColObj refreshed cache instance.
	 */
	IBusModelFloatColObj moveUpFloatCol( IBusModelFloatColObj Obj );

	/**
	 *	Move the BusModelFloatColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelFloatColObj refreshed cache instance.
	 */
	IBusModelFloatColObj moveDownFloatCol( IBusModelFloatColObj Obj );
}
