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

public interface IBusModelIndexTweakTableObj
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
	 *	Instantiate a new IndexTweak instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelIndexTweakObj newInstance();

	/**
	 *	Instantiate a new IndexTweak edition of the specified IndexTweak instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelIndexTweakEditObj newEditInstance( IBusModelIndexTweakObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelIndexTweakObj realiseIndexTweak( IBusModelIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelIndexTweakObj createIndexTweak( IBusModelIndexTweakObj Obj );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelIndexTweakObj readIndexTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a IndexTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The IndexTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelIndexTweakObj readIndexTweak( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelIndexTweakObj readCachedIndexTweak( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeIndexTweak( IBusModelIndexTweakObj obj );

	void deepDisposeIndexTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelIndexTweakObj lockIndexTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelIndexTweakObj> readAllIndexTweak();

	/**
	 *	Return a sorted map of all the IndexTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelIndexTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelIndexTweakObj> readAllIndexTweak( boolean forceRead );

	List<IBusModelIndexTweakObj> readCachedAllIndexTweak();

	/**
	 *	Get the BusModelTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelIndexTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByValTentIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelIndexTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelIndexTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelTweakObj instance for the unique UDefIdx key.
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
	 *	@return	BusModelTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelTweakObj instance for the unique UDefIdx key.
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
	 *	@return	BusModelTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelIndexTweakObj readIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelIndexTweakObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Get the map of BusModelIndexTweakObj instances sorted by their primary keys for the duplicate IndexIdx key.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelIndexTweakObj cached instances sorted by their primary keys for the duplicate IndexIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelIndexTweakObj> readIndexTweakByIndexIdx( ICFKeyHash256 IndexId,
		boolean forceRead );

	IBusModelIndexTweakObj readCachedIndexTweakByIdIdx( ICFKeyHash256 Id );

	IBusModelIndexTweakObj readCachedIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelIndexTweakObj> readCachedIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	List<IBusModelIndexTweakObj> readCachedIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelIndexTweakObj> readCachedIndexTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelIndexTweakObj readCachedIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	List<IBusModelIndexTweakObj> readCachedIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	void deepDisposeIndexTweakByIdIdx( ICFKeyHash256 Id );

	void deepDisposeIndexTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeIndexTweakByValTentIdx( ICFKeyHash256 TenantId );

	void deepDisposeIndexTweakByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeIndexTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeIndexTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeIndexTweakByIndexIdx( ICFKeyHash256 IndexId );

	/**
	 *	Internal use only.
	 */
	IBusModelIndexTweakObj updateIndexTweak( IBusModelIndexTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteIndexTweak( IBusModelIndexTweakObj Obj );

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
	void deleteIndexTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

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
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 */
	void deleteIndexTweakByIndexIdx( ICFKeyHash256 IndexId );
}
