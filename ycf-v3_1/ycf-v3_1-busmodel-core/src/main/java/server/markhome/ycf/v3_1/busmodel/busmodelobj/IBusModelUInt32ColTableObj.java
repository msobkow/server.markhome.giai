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

public interface IBusModelUInt32ColTableObj
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
	 *	Instantiate a new UInt32Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelUInt32ColObj newInstance();

	/**
	 *	Instantiate a new UInt32Col edition of the specified UInt32Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelUInt32ColEditObj newEditInstance( IBusModelUInt32ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt32ColObj realiseUInt32Col( IBusModelUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt32ColObj createUInt32Col( IBusModelUInt32ColObj Obj );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUInt32ColObj readUInt32Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a UInt32Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The UInt32Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUInt32ColObj readUInt32Col( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelUInt32ColObj readCachedUInt32Col( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeUInt32Col( IBusModelUInt32ColObj obj );

	void deepDisposeUInt32Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt32ColObj lockUInt32Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUInt32ColObj> readAllUInt32Col();

	/**
	 *	Return a sorted map of all the UInt32Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelUInt32ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUInt32ColObj> readAllUInt32Col( boolean forceRead );

	List<IBusModelUInt32ColObj> readCachedAllUInt32Col();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt32ColObj readUInt32ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt32ColObj readUInt32ColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt32ColObj readUInt32ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUInt32ColObj readUInt32ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelUInt32ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUInt32ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUInt32ColObj> readUInt32ColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelUInt32ColObj readCachedUInt32ColByIdIdx( ICFKeyHash256 Id );

	IBusModelUInt32ColObj readCachedUInt32ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelUInt32ColObj> readCachedUInt32ColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeUInt32ColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUInt32ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUInt32ColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUInt32ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeUInt32ColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeUInt32ColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeUInt32ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeUInt32ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeUInt32ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelUInt32ColObj updateUInt32Col( IBusModelUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUInt32Col( IBusModelUInt32ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The UInt32Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The UInt32Col key attribute of the instance generating the id.
	 */
	void deleteUInt32ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelUInt32ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUInt32ColObj refreshed cache instance.
	 */
	IBusModelUInt32ColObj moveUpUInt32Col( IBusModelUInt32ColObj Obj );

	/**
	 *	Move the BusModelUInt32ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUInt32ColObj refreshed cache instance.
	 */
	IBusModelUInt32ColObj moveDownUInt32Col( IBusModelUInt32ColObj Obj );
}
