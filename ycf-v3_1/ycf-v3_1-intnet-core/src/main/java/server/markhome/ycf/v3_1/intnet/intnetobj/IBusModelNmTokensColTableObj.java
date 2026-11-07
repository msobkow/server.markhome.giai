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

public interface IBusModelNmTokensColTableObj
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
	 *	Instantiate a new NmTokensCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelNmTokensColObj newInstance();

	/**
	 *	Instantiate a new NmTokensCol edition of the specified NmTokensCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelNmTokensColEditObj newEditInstance( IBusModelNmTokensColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensColObj realiseNmTokensCol( IBusModelNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensColObj createNmTokensCol( IBusModelNmTokensColObj Obj );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensColObj readNmTokensCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a NmTokensCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The NmTokensCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelNmTokensColObj readNmTokensCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelNmTokensColObj readCachedNmTokensCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeNmTokensCol( IBusModelNmTokensColObj obj );

	void deepDisposeNmTokensCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensColObj lockNmTokensCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensColObj> readAllNmTokensCol();

	/**
	 *	Return a sorted map of all the NmTokensCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelNmTokensColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelNmTokensColObj> readAllNmTokensCol( boolean forceRead );

	List<IBusModelNmTokensColObj> readCachedAllNmTokensCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensColObj readNmTokensColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensColObj readNmTokensColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensColObj readNmTokensColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelNmTokensColObj readNmTokensColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelNmTokensColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelNmTokensColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelNmTokensColObj> readNmTokensColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelNmTokensColObj readCachedNmTokensColByIdIdx( ICFKeyHash256 Id );

	IBusModelNmTokensColObj readCachedNmTokensColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelNmTokensColObj> readCachedNmTokensColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeNmTokensColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeNmTokensColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeNmTokensColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeNmTokensColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeNmTokensColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeNmTokensColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeNmTokensColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeNmTokensColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeNmTokensColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelNmTokensColObj updateNmTokensCol( IBusModelNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteNmTokensCol( IBusModelNmTokensColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The NmTokensCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The NmTokensCol key attribute of the instance generating the id.
	 */
	void deleteNmTokensColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelNmTokensColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensColObj refreshed cache instance.
	 */
	IBusModelNmTokensColObj moveUpNmTokensCol( IBusModelNmTokensColObj Obj );

	/**
	 *	Move the BusModelNmTokensColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelNmTokensColObj refreshed cache instance.
	 */
	IBusModelNmTokensColObj moveDownNmTokensCol( IBusModelNmTokensColObj Obj );
}
