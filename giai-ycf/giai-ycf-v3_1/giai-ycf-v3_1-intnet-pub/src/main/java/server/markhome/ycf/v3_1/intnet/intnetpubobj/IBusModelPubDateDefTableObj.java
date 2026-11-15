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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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

public interface IBusModelPubDateDefTableObj
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
	 *	Instantiate a new DateDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubDateDefObj newInstance();

	/**
	 *	Instantiate a new DateDef edition of the specified DateDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubDateDefEditObj newEditInstance( IBusModelPubDateDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateDefObj realiseDateDef( IBusModelPubDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateDefObj createDateDef( IBusModelPubDateDefObj Obj );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDateDefObj readDateDef( ICFKeyHash256 pkey );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubDateDefObj readDateDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubDateDefObj readCachedDateDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeDateDef( IBusModelPubDateDefObj obj );

	void deepDisposeDateDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateDefObj lockDateDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDateDefObj> readAllDateDef();

	/**
	 *	Return a sorted map of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubDateDefObj> readAllDateDef( boolean forceRead );

	List<IBusModelPubDateDefObj> readCachedAllDateDef();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateDefObj readDateDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateDefObj readDateDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateDefObj readDateDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubDateDefObj readDateDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubDateDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubDateDefObj> readDateDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	IBusModelPubDateDefObj readCachedDateDefByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubDateDefObj readCachedDateDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubDateDefObj> readCachedDateDefByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubDateDefObj> readCachedDateDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubDateDefObj> readCachedDateDefByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubDateDefObj> readCachedDateDefByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubDateDefObj> readCachedDateDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubDateDefObj> readCachedDateDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeDateDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeDateDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateDefByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeDateDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeDateDefByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeDateDefByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeDateDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeDateDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubDateDefObj updateDateDef( IBusModelPubDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateDef( IBusModelPubDateDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the BusModelPubDateDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDateDefObj refreshed cache instance.
	 */
	IBusModelPubDateDefObj moveUpDateDef( IBusModelPubDateDefObj Obj );

	/**
	 *	Move the BusModelPubDateDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubDateDefObj refreshed cache instance.
	 */
	IBusModelPubDateDefObj moveDownDateDef( IBusModelPubDateDefObj Obj );
}
