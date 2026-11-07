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

public interface IBusModelTextColTableObj
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
	 *	Instantiate a new TextCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTextColObj newInstance();

	/**
	 *	Instantiate a new TextCol edition of the specified TextCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTextColEditObj newEditInstance( IBusModelTextColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTextColObj realiseTextCol( IBusModelTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTextColObj createTextCol( IBusModelTextColObj Obj );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTextColObj readTextCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TextCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TextCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTextColObj readTextCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTextColObj readCachedTextCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTextCol( IBusModelTextColObj obj );

	void deepDisposeTextCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTextColObj lockTextCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTextColObj> readAllTextCol();

	/**
	 *	Return a sorted map of all the TextCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTextColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTextColObj> readAllTextCol( boolean forceRead );

	List<IBusModelTextColObj> readCachedAllTextCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTextColObj readTextColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTextColObj readTextColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTextColObj readTextColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTextColObj readTextColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelTextColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTextColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTextColObj> readTextColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelTextColObj readCachedTextColByIdIdx( ICFKeyHash256 Id );

	IBusModelTextColObj readCachedTextColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTextColObj> readCachedTextColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTextColObj> readCachedTextColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTextColObj> readCachedTextColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTextColObj> readCachedTextColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTextColObj> readCachedTextColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTextColObj> readCachedTextColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTextColObj> readCachedTextColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTextColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTextColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTextColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTextColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTextColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTextColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTextColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTextColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTextColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelTextColObj updateTextCol( IBusModelTextColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTextCol( IBusModelTextColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelTextColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTextColObj refreshed cache instance.
	 */
	IBusModelTextColObj moveUpTextCol( IBusModelTextColObj Obj );

	/**
	 *	Move the BusModelTextColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTextColObj refreshed cache instance.
	 */
	IBusModelTextColObj moveDownTextCol( IBusModelTextColObj Obj );
}
