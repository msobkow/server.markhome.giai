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

public interface IBusModelTZTimeColTableObj
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
	 *	Instantiate a new TZTimeCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTZTimeColObj newInstance();

	/**
	 *	Instantiate a new TZTimeCol edition of the specified TZTimeCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTZTimeColEditObj newEditInstance( IBusModelTZTimeColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTZTimeColObj realiseTZTimeCol( IBusModelTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTZTimeColObj createTZTimeCol( IBusModelTZTimeColObj Obj );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTZTimeColObj readTZTimeCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TZTimeCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TZTimeCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTZTimeColObj readTZTimeCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTZTimeColObj readCachedTZTimeCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTZTimeCol( IBusModelTZTimeColObj obj );

	void deepDisposeTZTimeCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTZTimeColObj lockTZTimeCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTZTimeColObj> readAllTZTimeCol();

	/**
	 *	Return a sorted map of all the TZTimeCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTZTimeColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTZTimeColObj> readAllTZTimeCol( boolean forceRead );

	List<IBusModelTZTimeColObj> readCachedAllTZTimeCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZTimeColObj readTZTimeColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZTimeColObj readTZTimeColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZTimeColObj readTZTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTZTimeColObj readTZTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelTZTimeColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTZTimeColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTZTimeColObj> readTZTimeColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelTZTimeColObj readCachedTZTimeColByIdIdx( ICFKeyHash256 Id );

	IBusModelTZTimeColObj readCachedTZTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTZTimeColObj> readCachedTZTimeColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTZTimeColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTZTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTZTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTZTimeColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTZTimeColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTZTimeColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTZTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTZTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTZTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelTZTimeColObj updateTZTimeCol( IBusModelTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTZTimeCol( IBusModelTZTimeColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TZTimeCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TZTimeCol key attribute of the instance generating the id.
	 */
	void deleteTZTimeColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelTZTimeColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTZTimeColObj refreshed cache instance.
	 */
	IBusModelTZTimeColObj moveUpTZTimeCol( IBusModelTZTimeColObj Obj );

	/**
	 *	Move the BusModelTZTimeColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTZTimeColObj refreshed cache instance.
	 */
	IBusModelTZTimeColObj moveDownTZTimeCol( IBusModelTZTimeColObj Obj );
}
