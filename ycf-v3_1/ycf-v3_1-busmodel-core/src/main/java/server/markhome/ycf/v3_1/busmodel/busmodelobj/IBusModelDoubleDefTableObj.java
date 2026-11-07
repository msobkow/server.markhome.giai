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

public interface IBusModelDoubleDefTableObj
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
	 *	Instantiate a new DoubleDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDoubleDefObj newInstance();

	/**
	 *	Instantiate a new DoubleDef edition of the specified DoubleDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDoubleDefEditObj newEditInstance( IBusModelDoubleDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDoubleDefObj realiseDoubleDef( IBusModelDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDoubleDefObj createDoubleDef( IBusModelDoubleDefObj Obj );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDoubleDefObj readDoubleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DoubleDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DoubleDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDoubleDefObj readDoubleDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDoubleDefObj readCachedDoubleDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDoubleDef( IBusModelDoubleDefObj obj );

	void deepDisposeDoubleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDoubleDefObj lockDoubleDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDoubleDefObj> readAllDoubleDef();

	/**
	 *	Return a sorted map of all the DoubleDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelDoubleDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDoubleDefObj> readAllDoubleDef( boolean forceRead );

	List<IBusModelDoubleDefObj> readCachedAllDoubleDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDoubleDefObj readDoubleDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDoubleDefObj readDoubleDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDoubleDefObj readDoubleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDoubleDefObj readDoubleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDoubleDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDoubleDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDoubleDefObj> readDoubleDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelDoubleDefObj readCachedDoubleDefByIdIdx( ICFKeyHash256 Id );

	IBusModelDoubleDefObj readCachedDoubleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelDoubleDefObj> readCachedDoubleDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeDoubleDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDoubleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDoubleDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDoubleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDoubleDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeDoubleDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeDoubleDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeDoubleDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelDoubleDefObj updateDoubleDef( IBusModelDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDoubleDef( IBusModelDoubleDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DoubleDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleDef key attribute of the instance generating the id.
	 */
	void deleteDoubleDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelDoubleDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDoubleDefObj refreshed cache instance.
	 */
	IBusModelDoubleDefObj moveUpDoubleDef( IBusModelDoubleDefObj Obj );

	/**
	 *	Move the BusModelDoubleDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDoubleDefObj refreshed cache instance.
	 */
	IBusModelDoubleDefObj moveDownDoubleDef( IBusModelDoubleDefObj Obj );
}
