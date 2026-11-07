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

public interface IBusModelTableColTableObj
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
	 *	Instantiate a new TableCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTableColObj newInstance();

	/**
	 *	Instantiate a new TableCol edition of the specified TableCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTableColEditObj newEditInstance( IBusModelTableColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTableColObj realiseTableCol( IBusModelTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTableColObj createTableCol( IBusModelTableColObj Obj );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTableColObj readTableCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TableCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTableColObj readTableCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTableColObj readCachedTableCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTableCol( IBusModelTableColObj obj );

	void deepDisposeTableCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTableColObj lockTableCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTableColObj> readAllTableCol();

	/**
	 *	Return a sorted map of all the TableCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTableColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTableColObj> readAllTableCol( boolean forceRead );

	List<IBusModelTableColObj> readCachedAllTableCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTableColObj readTableColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTableColObj readTableColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTableColObj readTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTableColObj readTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByDataIdx( ICFKeyHash256 DataId );

	/**
	 *	Get the map of BusModelTableColObj instances sorted by their primary keys for the duplicate DataIdx key.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTableColObj cached instances sorted by their primary keys for the duplicate DataIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTableColObj> readTableColByDataIdx( ICFKeyHash256 DataId,
		boolean forceRead );

	IBusModelTableColObj readCachedTableColByIdIdx( ICFKeyHash256 Id );

	IBusModelTableColObj readCachedTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTableColObj> readCachedTableColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTableColObj> readCachedTableColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTableColObj> readCachedTableColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTableColObj> readCachedTableColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTableColObj> readCachedTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTableColObj> readCachedTableColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTableColObj> readCachedTableColByTableIdx( ICFKeyHash256 TableId );

	List<IBusModelTableColObj> readCachedTableColByDataIdx( ICFKeyHash256 DataId );

	void deepDisposeTableColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTableColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTableColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTableColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTableColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTableColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTableColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTableColByDataIdx( ICFKeyHash256 DataId );

	/**
	 *	Internal use only.
	 */
	IBusModelTableColObj updateTableCol( IBusModelTableColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableCol( IBusModelTableColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DataId	The TableCol key attribute of the instance generating the id.
	 */
	void deleteTableColByDataIdx( ICFKeyHash256 DataId );

	/**
	 *	Move the BusModelTableColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTableColObj refreshed cache instance.
	 */
	IBusModelTableColObj moveUpTableCol( IBusModelTableColObj Obj );

	/**
	 *	Move the BusModelTableColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTableColObj refreshed cache instance.
	 */
	IBusModelTableColObj moveDownTableCol( IBusModelTableColObj Obj );
}
