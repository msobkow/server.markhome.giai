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

package server.markhome.ycf.v3_1.busmodel.busmodelprotobj;

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

public interface IBusModelProtIndexTweakTableObj
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
	 *	Instantiate a new IndexTweak instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtIndexTweakObj newInstance();

	/**
	 *	Instantiate a new IndexTweak edition of the specified IndexTweak instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtIndexTweakEditObj newEditInstance( IBusModelProtIndexTweakObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexTweakObj realiseIndexTweak( IBusModelProtIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexTweakObj createIndexTweak( IBusModelProtIndexTweakObj Obj );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweak( CFDbKeyHash256 pkey );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweak( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtIndexTweakObj readCachedIndexTweak( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeIndexTweak( IBusModelProtIndexTweakObj obj );

	void deepDisposeIndexTweak( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexTweakObj lockIndexTweak( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readAllIndexTweak();

	/**
	 *	Return a sorted map of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readAllIndexTweak( boolean forceRead );

	List<IBusModelProtIndexTweakObj> readCachedAllIndexTweak();

	/**
	 *	Get the IBusModelProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByValTentIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of IBusModelProtIndexTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the IBusModelProtTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtIndexTweakObj readIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtIndexTweakObj> instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexTweakObj> cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Get the map of List<IBusModelProtIndexTweakObj> instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtIndexTweakObj> cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtIndexTweakObj> readIndexTweakByIndexIdx( ICFKeyHash256 IndexId,
		boolean forceRead );

	IBusModelProtTweakObj readCachedIndexTweakByIdIdx( ICFKeyHash256 Id );

	IBusModelProtTweakObj readCachedIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<List<IBusModelProtTweakObj>> readCachedIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtTweakObj>> readCachedIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	List<List<IBusModelProtTweakObj>> readCachedIndexTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtTweakObj readCachedIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	List<List<IBusModelProtIndexTweakObj>> readCachedIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	void deepDisposeIndexTweakByIdIdx( ICFKeyHash256 Id );

	void deepDisposeIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	void deepDisposeIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeIndexTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtIndexTweakObj updateIndexTweak( IBusModelProtIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexTweak( IBusModelProtIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIndexIdx( ICFKeyHash256 IndexId );
}
