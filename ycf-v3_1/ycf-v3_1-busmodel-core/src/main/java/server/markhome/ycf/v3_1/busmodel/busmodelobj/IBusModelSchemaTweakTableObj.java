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

public interface IBusModelSchemaTweakTableObj
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
	 *	Instantiate a new SchemaTweak instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelSchemaTweakObj newInstance();

	/**
	 *	Instantiate a new SchemaTweak edition of the specified SchemaTweak instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelSchemaTweakEditObj newEditInstance( IBusModelSchemaTweakObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaTweakObj realiseSchemaTweak( IBusModelSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaTweakObj createSchemaTweak( IBusModelSchemaTweakObj Obj );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a SchemaTweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaTweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweak( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelSchemaTweakObj readCachedSchemaTweak( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeSchemaTweak( IBusModelSchemaTweakObj obj );

	void deepDisposeSchemaTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaTweakObj lockSchemaTweak( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelSchemaTweakObj> readAllSchemaTweak();

	/**
	 *	Return a sorted map of all the SchemaTweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelSchemaTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelSchemaTweakObj> readAllSchemaTweak( boolean forceRead );

	List<IBusModelSchemaTweakObj> readCachedAllSchemaTweak();

	/**
	 *	Get the BusModelTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelSchemaTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByValTentIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelSchemaTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByScopeIdx( ICFKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelSchemaTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelSchemaTweakObj readSchemaTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelSchemaTweakObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Get the map of BusModelSchemaTweakObj instances sorted by their primary keys for the duplicate SchemaIdx key.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelSchemaTweakObj cached instances sorted by their primary keys for the duplicate SchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelSchemaTweakObj> readSchemaTweakBySchemaIdx( ICFKeyHash256 SchemaDefId,
		boolean forceRead );

	IBusModelSchemaTweakObj readCachedSchemaTweakByIdIdx( ICFKeyHash256 Id );

	IBusModelSchemaTweakObj readCachedSchemaTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	List<IBusModelSchemaTweakObj> readCachedSchemaTweakByValTentIdx( ICFKeyHash256 TenantId );

	List<IBusModelSchemaTweakObj> readCachedSchemaTweakByScopeIdx( ICFKeyHash256 ScopeId );

	List<IBusModelSchemaTweakObj> readCachedSchemaTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelSchemaTweakObj readCachedSchemaTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	List<IBusModelSchemaTweakObj> readCachedSchemaTweakBySchemaIdx( ICFKeyHash256 SchemaDefId );

	void deepDisposeSchemaTweakByIdIdx( ICFKeyHash256 Id );

	void deepDisposeSchemaTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	void deepDisposeSchemaTweakByValTentIdx( ICFKeyHash256 TenantId );

	void deepDisposeSchemaTweakByScopeIdx( ICFKeyHash256 ScopeId );

	void deepDisposeSchemaTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeSchemaTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeSchemaTweakBySchemaIdx( ICFKeyHash256 SchemaDefId );

	/**
	 *	Internal use only.
	 */
	IBusModelSchemaTweakObj updateSchemaTweak( IBusModelSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaTweak( IBusModelSchemaTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUNameIdx( ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByValTentIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByScopeIdx( ICFKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The SchemaTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakByUDefIdx( ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	SchemaDefId	The SchemaTweak key attribute of the instance generating the id.
	 */
	void deleteSchemaTweakBySchemaIdx( ICFKeyHash256 SchemaDefId );
}
