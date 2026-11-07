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

public interface IBusModelUuid6ColTableObj
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
	 *	Instantiate a new Uuid6Col instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelUuid6ColObj newInstance();

	/**
	 *	Instantiate a new Uuid6Col edition of the specified Uuid6Col instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelUuid6ColEditObj newEditInstance( IBusModelUuid6ColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelUuid6ColObj realiseUuid6Col( IBusModelUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelUuid6ColObj createUuid6Col( IBusModelUuid6ColObj Obj );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuid6ColObj readUuid6Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a Uuid6Col-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Uuid6Col-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelUuid6ColObj readUuid6Col( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelUuid6ColObj readCachedUuid6Col( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeUuid6Col( IBusModelUuid6ColObj obj );

	void deepDisposeUuid6Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelUuid6ColObj lockUuid6Col( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuid6ColObj> readAllUuid6Col();

	/**
	 *	Return a sorted map of all the Uuid6Col-derived instances in the database.
	 *
	 *	@return	List of IBusModelUuid6ColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelUuid6ColObj> readAllUuid6Col( boolean forceRead );

	List<IBusModelUuid6ColObj> readCachedAllUuid6Col();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuid6ColObj readUuid6ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuid6ColObj readUuid6ColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuid6ColObj readUuid6ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelUuid6ColObj readUuid6ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelUuid6ColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelUuid6ColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelUuid6ColObj> readUuid6ColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelUuid6ColObj readCachedUuid6ColByIdIdx( ICFKeyHash256 Id );

	IBusModelUuid6ColObj readCachedUuid6ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelUuid6ColObj> readCachedUuid6ColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeUuid6ColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeUuid6ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeUuid6ColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeUuid6ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeUuid6ColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeUuid6ColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeUuid6ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeUuid6ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeUuid6ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelUuid6ColObj updateUuid6Col( IBusModelUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteUuid6Col( IBusModelUuid6ColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Uuid6Col key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Uuid6Col key attribute of the instance generating the id.
	 */
	void deleteUuid6ColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelUuid6ColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuid6ColObj refreshed cache instance.
	 */
	IBusModelUuid6ColObj moveUpUuid6Col( IBusModelUuid6ColObj Obj );

	/**
	 *	Move the BusModelUuid6ColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelUuid6ColObj refreshed cache instance.
	 */
	IBusModelUuid6ColObj moveDownUuid6Col( IBusModelUuid6ColObj Obj );
}
