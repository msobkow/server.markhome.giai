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

public interface IBusModelPubValueTableObj
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
	 *	Instantiate a new Value instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubValueObj newInstance();

	/**
	 *	Instantiate a new Value edition of the specified Value instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubValueEditObj newEditInstance( IBusModelPubValueObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelPubValueObj instance, which may be a subclass of a Value instance.
	 */
	IBusModelPubValueObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelPubValueObj realiseValue( IBusModelPubValueObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubValueObj createValue( IBusModelPubValueObj Obj );

	/**
	 *	Read a Value-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Value-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubValueObj readValue( ICFKeyHash256 pkey );

	/**
	 *	Read a Value-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Value-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubValueObj readValue( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubValueObj readCachedValue( ICFKeyHash256 pkey );

	public void reallyDeepDisposeValue( IBusModelPubValueObj obj );

	void deepDisposeValue( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubValueObj lockValue( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Value-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubValueObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubValueObj> readAllValue();

	/**
	 *	Return a sorted map of all the Value-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubValueObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubValueObj> readAllValue( boolean forceRead );

	List<IBusModelPubValueObj> readCachedAllValue();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Value key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubValueObj readValueByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Value key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubValueObj readValueByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Value key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubValueObj readValueByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Value key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubValueObj readValueByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubValueObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubValueObj> readValueByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubValueObj readCachedValueByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubValueObj readCachedValueByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubValueObj> readCachedValueByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubValueObj> readCachedValueByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubValueObj> readCachedValueByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubValueObj> readCachedValueByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubValueObj> readCachedValueByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubValueObj> readCachedValueByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeValueByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeValueByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeValueByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeValueByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeValueByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeValueByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeValueByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeValueByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubValueObj updateValue( IBusModelPubValueObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteValue( IBusModelPubValueObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Value key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Value key attribute of the instance generating the id.
	 */
	void deleteValueByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubValueObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubValueObj refreshed cache instance.
	 */
	IBusModelPubValueObj moveUpValue( IBusModelPubValueObj Obj );

	/**
	 *	Move the BusModelPubValueObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubValueObj refreshed cache instance.
	 */
	IBusModelPubValueObj moveDownValue( IBusModelPubValueObj Obj );
}
