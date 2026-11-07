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

public interface IBusModelDateDefTableObj
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
	 *	Instantiate a new DateDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelDateDefObj newInstance();

	/**
	 *	Instantiate a new DateDef edition of the specified DateDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelDateDefEditObj newEditInstance( IBusModelDateDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelDateDefObj realiseDateDef( IBusModelDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelDateDefObj createDateDef( IBusModelDateDefObj Obj );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateDefObj readDateDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a DateDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The DateDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelDateDefObj readDateDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelDateDefObj readCachedDateDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeDateDef( IBusModelDateDefObj obj );

	void deepDisposeDateDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelDateDefObj lockDateDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateDefObj> readAllDateDef();

	/**
	 *	Return a sorted map of all the DateDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelDateDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelDateDefObj> readAllDateDef( boolean forceRead );

	List<IBusModelDateDefObj> readCachedAllDateDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateDefObj readDateDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateDefObj readDateDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateDefObj readDateDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelDateDefObj readDateDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelDateDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelDateDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelDateDefObj> readDateDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelDateDefObj readCachedDateDefByIdIdx( ICFKeyHash256 Id );

	IBusModelDateDefObj readCachedDateDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelDateDefObj> readCachedDateDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelDateDefObj> readCachedDateDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelDateDefObj> readCachedDateDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelDateDefObj> readCachedDateDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelDateDefObj> readCachedDateDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelDateDefObj> readCachedDateDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeDateDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeDateDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeDateDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeDateDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeDateDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeDateDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeDateDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeDateDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelDateDefObj updateDateDef( IBusModelDateDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteDateDef( IBusModelDateDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The DateDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DateDef key attribute of the instance generating the id.
	 */
	void deleteDateDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelDateDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateDefObj refreshed cache instance.
	 */
	IBusModelDateDefObj moveUpDateDef( IBusModelDateDefObj Obj );

	/**
	 *	Move the BusModelDateDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelDateDefObj refreshed cache instance.
	 */
	IBusModelDateDefObj moveDownDateDef( IBusModelDateDefObj Obj );
}
