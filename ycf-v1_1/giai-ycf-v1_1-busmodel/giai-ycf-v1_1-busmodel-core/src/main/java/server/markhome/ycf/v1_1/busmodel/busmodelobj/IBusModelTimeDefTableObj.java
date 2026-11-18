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

public interface IBusModelTimeDefTableObj
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
	 *	Instantiate a new TimeDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTimeDefObj newInstance();

	/**
	 *	Instantiate a new TimeDef edition of the specified TimeDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTimeDefEditObj newEditInstance( IBusModelTimeDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeDefObj realiseTimeDef( IBusModelTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeDefObj createTimeDef( IBusModelTimeDefObj Obj );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimeDefObj readTimeDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TimeDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TimeDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTimeDefObj readTimeDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTimeDefObj readCachedTimeDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTimeDef( IBusModelTimeDefObj obj );

	void deepDisposeTimeDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeDefObj lockTimeDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimeDefObj> readAllTimeDef();

	/**
	 *	Return a sorted map of all the TimeDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelTimeDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTimeDefObj> readAllTimeDef( boolean forceRead );

	List<IBusModelTimeDefObj> readCachedAllTimeDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeDefObj readTimeDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeDefObj readTimeDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeDefObj readTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTimeDefObj readTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTimeDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTimeDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTimeDefObj> readTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelTimeDefObj readCachedTimeDefByIdIdx( ICFKeyHash256 Id );

	IBusModelTimeDefObj readCachedTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTimeDefObj> readCachedTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTimeDefObj> readCachedTimeDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTimeDefObj> readCachedTimeDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTimeDefObj> readCachedTimeDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTimeDefObj> readCachedTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTimeDefObj> readCachedTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTimeDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTimeDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTimeDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTimeDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelTimeDefObj updateTimeDef( IBusModelTimeDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTimeDef( IBusModelTimeDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TimeDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimeDef key attribute of the instance generating the id.
	 */
	void deleteTimeDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelTimeDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimeDefObj refreshed cache instance.
	 */
	IBusModelTimeDefObj moveUpTimeDef( IBusModelTimeDefObj Obj );

	/**
	 *	Move the BusModelTimeDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTimeDefObj refreshed cache instance.
	 */
	IBusModelTimeDefObj moveDownTimeDef( IBusModelTimeDefObj Obj );
}
