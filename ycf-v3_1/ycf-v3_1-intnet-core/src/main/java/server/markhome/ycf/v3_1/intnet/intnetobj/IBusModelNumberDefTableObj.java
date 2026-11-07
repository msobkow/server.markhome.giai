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

package server.markhome.ycf.v3_1.intnet.intnetobj;

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

public interface IBusModelNumberDefTableObj
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
	 *	Instantiate a new NumberDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNumberDefObj newInstance();

	/**
	 *	Instantiate a new NumberDef edition of the specified NumberDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNumberDefEditObj newEditInstance( IBusModelNumberDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberDefObj realiseNumberDef( IBusModelNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberDefObj createNumberDef( IBusModelNumberDefObj Obj );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNumberDefObj readNumberDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NumberDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NumberDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNumberDefObj readNumberDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNumberDefObj readCachedNumberDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNumberDef( IBusModelNumberDefObj obj );

	void deepDisposeNumberDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberDefObj lockNumberDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNumberDefObj> readAllNumberDef();

	/**
	 *	Return a sorted map of all the NumberDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelNumberDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNumberDefObj> readAllNumberDef( boolean forceRead );

	List<IBusModelNumberDefObj> readCachedAllNumberDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberDefObj readNumberDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberDefObj readNumberDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberDefObj readNumberDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNumberDefObj readNumberDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNumberDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNumberDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNumberDefObj> readNumberDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelNumberDefObj readCachedNumberDefByIdIdx( ICFKeyHash256 Id );

	IBusModelNumberDefObj readCachedNumberDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNumberDefObj> readCachedNumberDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNumberDefObj> readCachedNumberDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNumberDefObj> readCachedNumberDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNumberDefObj> readCachedNumberDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNumberDefObj> readCachedNumberDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNumberDefObj> readCachedNumberDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNumberDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNumberDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNumberDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNumberDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNumberDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNumberDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNumberDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNumberDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelNumberDefObj updateNumberDef( IBusModelNumberDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNumberDef( IBusModelNumberDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 */
	void deleteNumberDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelNumberDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNumberDefObj refreshed cache instance.
	 */
	IBusModelNumberDefObj moveUpNumberDef( IBusModelNumberDefObj Obj );

	/**
	 *	Move the BusModelNumberDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNumberDefObj refreshed cache instance.
	 */
	IBusModelNumberDefObj moveDownNumberDef( IBusModelNumberDefObj Obj );
}
