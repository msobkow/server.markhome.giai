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

public interface IBusModelTokenColTableObj
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
	 *	Instantiate a new TokenCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelTokenColObj newInstance();

	/**
	 *	Instantiate a new TokenCol edition of the specified TokenCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelTokenColEditObj newEditInstance( IBusModelTokenColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenColObj realiseTokenCol( IBusModelTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenColObj createTokenCol( IBusModelTokenColObj Obj );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTokenColObj readTokenCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a TokenCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TokenCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelTokenColObj readTokenCol( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelTokenColObj readCachedTokenCol( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeTokenCol( IBusModelTokenColObj obj );

	void deepDisposeTokenCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenColObj lockTokenCol( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTokenColObj> readAllTokenCol();

	/**
	 *	Return a sorted map of all the TokenCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelTokenColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelTokenColObj> readAllTokenCol( boolean forceRead );

	List<IBusModelTokenColObj> readCachedAllTokenCol();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenColObj readTokenColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenColObj readTokenColByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenColObj readTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelTokenColObj readTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelTokenColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelTokenColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelTokenColObj> readTokenColByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelTokenColObj readCachedTokenColByIdIdx( ICFKeyHash256 Id );

	IBusModelTokenColObj readCachedTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelTokenColObj> readCachedTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelTokenColObj> readCachedTokenColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelTokenColObj> readCachedTokenColByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelTokenColObj> readCachedTokenColByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelTokenColObj> readCachedTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelTokenColObj> readCachedTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	List<IBusModelTokenColObj> readCachedTokenColByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTokenColByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTokenColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeTokenColByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeTokenColByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelTokenColObj updateTokenCol( IBusModelTokenColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTokenCol( IBusModelTokenColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TokenCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TokenCol key attribute of the instance generating the id.
	 */
	void deleteTokenColByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Move the BusModelTokenColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTokenColObj refreshed cache instance.
	 */
	IBusModelTokenColObj moveUpTokenCol( IBusModelTokenColObj Obj );

	/**
	 *	Move the BusModelTokenColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelTokenColObj refreshed cache instance.
	 */
	IBusModelTokenColObj moveDownTokenCol( IBusModelTokenColObj Obj );
}
