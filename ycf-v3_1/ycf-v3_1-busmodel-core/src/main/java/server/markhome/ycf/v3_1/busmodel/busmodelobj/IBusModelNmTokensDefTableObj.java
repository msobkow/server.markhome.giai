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

public interface IBusModelNmTokensDefTableObj
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
	 *	Instantiate a new NmTokensDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNmTokensDefObj newInstance();

	/**
	 *	Instantiate a new NmTokensDef edition of the specified NmTokensDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNmTokensDefEditObj newEditInstance( IBusModelNmTokensDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensDefObj realiseNmTokensDef( IBusModelNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensDefObj createNmTokensDef( IBusModelNmTokensDefObj Obj );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NmTokensDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNmTokensDefObj readCachedNmTokensDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNmTokensDef( IBusModelNmTokensDefObj obj );

	void deepDisposeNmTokensDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensDefObj lockNmTokensDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensDefObj> readAllNmTokensDef();

	/**
	 *	Return a sorted map of all the NmTokensDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensDefObj> readAllNmTokensDef( boolean forceRead );

	List<IBusModelNmTokensDefObj> readCachedAllNmTokensDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensDefObj readNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensDefObj> readNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelNmTokensDefObj readCachedNmTokensDefByIdIdx( ICFKeyHash256 Id );

	IBusModelNmTokensDefObj readCachedNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNmTokensDefObj> readCachedNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNmTokensDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNmTokensDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNmTokensDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNmTokensDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensDefObj updateNmTokensDef( IBusModelNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensDef( IBusModelNmTokensDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensDef key attribute of the instance generating the id.
	 */
	void deleteNmTokensDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelNmTokensDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensDefObj refreshed cache instance.
	 */
	IBusModelNmTokensDefObj moveUpNmTokensDef( IBusModelNmTokensDefObj Obj );

	/**
	 *	Move the BusModelNmTokensDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensDefObj refreshed cache instance.
	 */
	IBusModelNmTokensDefObj moveDownNmTokensDef( IBusModelNmTokensDefObj Obj );
}
