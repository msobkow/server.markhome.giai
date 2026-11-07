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

public interface IBusModelProtBoolDefTableObj
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
	 *	Instantiate a new BoolDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtBoolDefObj newInstance();

	/**
	 *	Instantiate a new BoolDef edition of the specified BoolDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtBoolDefEditObj newEditInstance( IBusModelProtBoolDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolDefObj realiseBoolDef( IBusModelProtBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolDefObj createBoolDef( IBusModelProtBoolDefObj Obj );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtBoolDefObj readBoolDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtBoolDefObj readBoolDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtBoolDefObj readCachedBoolDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeBoolDef( IBusModelProtBoolDefObj obj );

	void deepDisposeBoolDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolDefObj lockBoolDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtBoolDefObj> readAllBoolDef();

	/**
	 *	Return a sorted map of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtBoolDefObj> readAllBoolDef( boolean forceRead );

	List<IBusModelProtBoolDefObj> readCachedAllBoolDef();

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolDefObj readBoolDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolDefObj readBoolDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolDefObj readBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtBoolDefObj readBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of IBusModelProtBoolDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtBoolDefObj> readBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelProtValueObj readCachedBoolDefByIdIdx( ICFKeyHash256 Id );

	IBusModelProtValueObj readCachedBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByNextIdx( CFDbKeyHash256 NextId );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<List<IBusModelProtValueObj>> readCachedBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeBoolDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeBoolDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeBoolDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeBoolDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtBoolDefObj updateBoolDef( IBusModelProtBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolDef( IBusModelProtBoolDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the IBusModelProtBoolDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtBoolDefObj refreshed cache instance.
	 */
	IBusModelProtBoolDefObj moveUpBoolDef( IBusModelProtBoolDefObj Obj );

	/**
	 *	Move the IBusModelProtBoolDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	IBusModelProtBoolDefObj refreshed cache instance.
	 */
	IBusModelProtBoolDefObj moveDownBoolDef( IBusModelProtBoolDefObj Obj );
}
