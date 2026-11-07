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

public interface IBusModelInt32DefTableObj
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
	 *	Instantiate a new Int32Def instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelInt32DefObj newInstance();

	/**
	 *	Instantiate a new Int32Def edition of the specified Int32Def instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelInt32DefEditObj newEditInstance( IBusModelInt32DefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelInt32DefObj realiseInt32Def( IBusModelInt32DefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelInt32DefObj createInt32Def( IBusModelInt32DefObj Obj );

	/**
	 *	Read a Int32Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelInt32DefObj readInt32Def( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a Int32Def-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Int32Def-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelInt32DefObj readInt32Def( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelInt32DefObj readCachedInt32Def( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeInt32Def( IBusModelInt32DefObj obj );

	void deepDisposeInt32Def( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelInt32DefObj lockInt32Def( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the Int32Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelInt32DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelInt32DefObj> readAllInt32Def();

	/**
	 *	Return a sorted map of all the Int32Def-derived instances in the database.
	 *
	 *	@return	List of IBusModelInt32DefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelInt32DefObj> readAllInt32Def( boolean forceRead );

	List<IBusModelInt32DefObj> readCachedAllInt32Def();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelInt32DefObj readInt32DefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelInt32DefObj readInt32DefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelInt32DefObj readInt32DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelInt32DefObj readInt32DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelInt32DefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelInt32DefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelInt32DefObj> readInt32DefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelInt32DefObj readCachedInt32DefByIdIdx( ICFKeyHash256 Id );

	IBusModelInt32DefObj readCachedInt32DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelInt32DefObj> readCachedInt32DefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelInt32DefObj> readCachedInt32DefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelInt32DefObj> readCachedInt32DefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelInt32DefObj> readCachedInt32DefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelInt32DefObj> readCachedInt32DefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelInt32DefObj> readCachedInt32DefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeInt32DefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeInt32DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeInt32DefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeInt32DefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeInt32DefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeInt32DefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeInt32DefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeInt32DefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelInt32DefObj updateInt32Def( IBusModelInt32DefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteInt32Def( IBusModelInt32DefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Int32Def key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Int32Def key attribute of the instance generating the id.
	 */
	void deleteInt32DefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelInt32DefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelInt32DefObj refreshed cache instance.
	 */
	IBusModelInt32DefObj moveUpInt32Def( IBusModelInt32DefObj Obj );

	/**
	 *	Move the BusModelInt32DefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelInt32DefObj refreshed cache instance.
	 */
	IBusModelInt32DefObj moveDownInt32Def( IBusModelInt32DefObj Obj );
}
