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

public interface IBusModelBoolDefTableObj
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
	 *	Instantiate a new BoolDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelBoolDefObj newInstance();

	/**
	 *	Instantiate a new BoolDef edition of the specified BoolDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelBoolDefEditObj newEditInstance( IBusModelBoolDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolDefObj realiseBoolDef( IBusModelBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolDefObj createBoolDef( IBusModelBoolDefObj Obj );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelBoolDefObj readBoolDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a BoolDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BoolDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelBoolDefObj readBoolDef( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelBoolDefObj readCachedBoolDef( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeBoolDef( IBusModelBoolDefObj obj );

	void deepDisposeBoolDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolDefObj lockBoolDef( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelBoolDefObj> readAllBoolDef();

	/**
	 *	Return a sorted map of all the BoolDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelBoolDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelBoolDefObj> readAllBoolDef( boolean forceRead );

	List<IBusModelBoolDefObj> readCachedAllBoolDef();

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolDefObj readBoolDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolDefObj readBoolDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolDefObj readBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelBoolDefObj readBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByPrevIdx( ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByNextIdx( ICFKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Get the map of BusModelBoolDefObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelBoolDefObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelBoolDefObj> readBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId,
		boolean forceRead );

	IBusModelBoolDefObj readCachedBoolDefByIdIdx( ICFKeyHash256 Id );

	IBusModelBoolDefObj readCachedBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelBoolDefObj> readCachedBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelBoolDefObj> readCachedBoolDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	List<IBusModelBoolDefObj> readCachedBoolDefByPrevIdx( ICFKeyHash256 PrevId );

	List<IBusModelBoolDefObj> readCachedBoolDefByNextIdx( ICFKeyHash256 NextId );

	List<IBusModelBoolDefObj> readCachedBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	List<IBusModelBoolDefObj> readCachedBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	void deepDisposeBoolDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeBoolDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeBoolDefByPrevIdx( ICFKeyHash256 PrevId );

	void deepDisposeBoolDefByNextIdx( ICFKeyHash256 NextId );

	void deepDisposeBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	void deepDisposeBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 */
	IBusModelBoolDefObj updateBoolDef( IBusModelBoolDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBoolDef( IBusModelBoolDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByPrevIdx( ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByNextIdx( ICFKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContPrevIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BoolDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BoolDef key attribute of the instance generating the id.
	 */
	void deleteBoolDefByContNextIdx( ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Move the BusModelBoolDefObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelBoolDefObj refreshed cache instance.
	 */
	IBusModelBoolDefObj moveUpBoolDef( IBusModelBoolDefObj Obj );

	/**
	 *	Move the BusModelBoolDefObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelBoolDefObj refreshed cache instance.
	 */
	IBusModelBoolDefObj moveDownBoolDef( IBusModelBoolDefObj Obj );
}
