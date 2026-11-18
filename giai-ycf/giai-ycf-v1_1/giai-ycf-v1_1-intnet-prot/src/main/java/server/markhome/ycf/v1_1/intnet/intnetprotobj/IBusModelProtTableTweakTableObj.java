// Description: Java 25 Protected Table Object interface for BusModelProt.

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

package server.markhome.ycf.v3_1.intnet.intnetprotobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

public interface IBusModelProtTableTweakTableObj
{
	public IBusModelProtSchemaObj getSchema();
	public void setSchema( IBusModelProtSchemaObj value );

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
	 *	Instantiate a new TableTweak instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtTableTweakObj newInstance();

	/**
	 *	Instantiate a new TableTweak edition of the specified TableTweak instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtTableTweakEditObj newEditInstance( IBusModelProtTableTweakObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableTweakObj realiseTableTweak( IBusModelProtTableTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableTweakObj createTableTweak( IBusModelProtTableTweakObj Obj );

	/**
	 *	Read a TableTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableTweakObj readTableTweak( CFDbKeyHash256 pkey );

	/**
	 *	Read a TableTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The TableTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtTableTweakObj readTableTweak( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtTableTweakObj readCachedTableTweak( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeTableTweak( IBusModelProtTableTweakObj obj );

	void deepDisposeTableTweak( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableTweakObj lockTableTweak( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the TableTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableTweakObj> readAllTableTweak();

	/**
	 *	Return a sorted map of all the TableTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtTableTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtTableTweakObj> readAllTableTweak( boolean forceRead );

	List<IBusModelProtTableTweakObj> readCachedAllTableTweak();

	/**
	 *	Get the IBusModelProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByValTentIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtTableTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtTableTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtTableTweakObj readTableTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtTableTweakObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableTweakObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtTableTweakObj> instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtTableTweakObj> cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtTableTweakObj> readTableTweakByTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	IBusModelProtTweakObj readCachedTableTweakByIdIdx( ICFKeyHash256 Id );

	IBusModelProtTweakObj readCachedTableTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtTweakObj>> readCachedTableTweakByValTentIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtTweakObj>> readCachedTableTweakByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtTweakObj>> readCachedTableTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtTweakObj readCachedTableTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	List<List<IBusModelProtTableTweakObj>> readCachedTableTweakByTableIdx( ICFKeyHash256 TableId );

	void deepDisposeTableTweakByIdIdx( ICFKeyHash256 Id );

	void deepDisposeTableTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeTableTweakByValTentIdx( ICFKeyHash256 TenantId );

	void deepDisposeTableTweakByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeTableTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTableTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeTableTweakByTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtTableTweakObj updateTableTweak( IBusModelProtTableTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTableTweak( IBusModelProtTableTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByTableIdx( ICFKeyHash256 TableId );
}
