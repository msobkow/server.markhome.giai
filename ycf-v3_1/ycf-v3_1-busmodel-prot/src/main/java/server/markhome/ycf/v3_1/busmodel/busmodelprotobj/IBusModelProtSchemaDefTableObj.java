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

public interface IBusModelProtSchemaDefTableObj
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
	 *	Instantiate a new SchemaDef instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtSchemaDefObj newInstance();

	/**
	 *	Instantiate a new SchemaDef edition of the specified SchemaDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtSchemaDefEditObj newEditInstance( IBusModelProtSchemaDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaDefObj realiseSchemaDef( IBusModelProtSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaDefObj createSchemaDef( IBusModelProtSchemaDefObj Obj );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDef( CFDbKeyHash256 pkey );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDef( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtSchemaDefObj readCachedSchemaDef( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeSchemaDef( IBusModelProtSchemaDefObj obj );

	void deepDisposeSchemaDef( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaDefObj lockSchemaDef( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readAllSchemaDef();

	/**
	 *	Return a sorted map of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readAllSchemaDef( boolean forceRead );

	List<IBusModelProtSchemaDefObj> readCachedAllSchemaDef();

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of IBusModelProtSchemaDefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Get the map of IBusModelProtSchemaDefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of IBusModelProtSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByTenantIdx( ICFKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByCTenantIdx( ICFKeyHash256 CTenantId );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByCTenantIdx( ICFKeyHash256 CTenantId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByMinorVersionIdx( ICFKeyHash256 MinorVersionId );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByMinorVersionIdx( ICFKeyHash256 MinorVersionId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByUNameIdx(ICFKeyHash256 MinorVersionId,
		String Name );

	/**
	 *	Get the IBusModelProtSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByUNameIdx(ICFKeyHash256 MinorVersionId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByAuthEMailIdx( ICFKeyHash256 CTenantId,
		String AuthorEMail );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByAuthEMailIdx( ICFKeyHash256 CTenantId,
		String AuthorEMail,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByProjectURLIdx( ICFKeyHash256 CTenantId,
		String ProjectURL );

	/**
	 *	Get the map of List<IBusModelProtSchemaDefObj> instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtSchemaDefObj> cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtSchemaDefObj> readSchemaDefByProjectURLIdx( ICFKeyHash256 CTenantId,
		String ProjectURL,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaDefObj cached instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByPubURIIdx(ICFKeyHash256 CTenantId,
		String PublishURI );

	/**
	 *	Get the IBusModelProtSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtSchemaDefObj refreshed instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtSchemaDefObj readSchemaDefByPubURIIdx(ICFKeyHash256 CTenantId,
		String PublishURI,
		boolean forceRead );

	IBusModelProtScopeObj readCachedSchemaDefByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtScopeObj>> readCachedSchemaDefByTenantIdx( ICFKeyHash256 TenantId );

	List<List<IBusModelProtSchemaDefObj>> readCachedSchemaDefByCTenantIdx( ICFKeyHash256 CTenantId );

	List<List<IBusModelProtSchemaDefObj>> readCachedSchemaDefByMinorVersionIdx( ICFKeyHash256 MinorVersionId );

	IBusModelProtSchemaDefObj readCachedSchemaDefByUNameIdx( ICFKeyHash256 MinorVersionId,
		String Name );

	List<List<IBusModelProtSchemaDefObj>> readCachedSchemaDefByAuthEMailIdx( ICFKeyHash256 CTenantId,
		String AuthorEMail );

	List<List<IBusModelProtSchemaDefObj>> readCachedSchemaDefByProjectURLIdx( ICFKeyHash256 CTenantId,
		String ProjectURL );

	IBusModelProtSchemaDefObj readCachedSchemaDefByPubURIIdx( ICFKeyHash256 CTenantId,
		String PublishURI );

	void deepDisposeSchemaDefByIdIdx( ICFKeyHash256 Id );

	void deepDisposeSchemaDefByTenantIdx( ICFKeyHash256 TenantId );

	void deepDisposeSchemaDefByCTenantIdx( ICFKeyHash256 CTenantId );

	void deepDisposeSchemaDefByMinorVersionIdx( ICFKeyHash256 MinorVersionId );

	void deepDisposeSchemaDefByUNameIdx( ICFKeyHash256 MinorVersionId,
		String Name );

	void deepDisposeSchemaDefByAuthEMailIdx( ICFKeyHash256 CTenantId,
		String AuthorEMail );

	void deepDisposeSchemaDefByProjectURLIdx( ICFKeyHash256 CTenantId,
		String ProjectURL );

	void deepDisposeSchemaDefByPubURIIdx( ICFKeyHash256 CTenantId,
		String PublishURI );

	/**
	 *	Internal use only.
	 */
	IBusModelProtSchemaDefObj updateSchemaDef( IBusModelProtSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaDef( IBusModelProtSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByTenantIdx( ICFKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByCTenantIdx( ICFKeyHash256 CTenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByMinorVersionIdx( ICFKeyHash256 MinorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByUNameIdx(ICFKeyHash256 MinorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByAuthEMailIdx( ICFKeyHash256 CTenantId,
		String AuthorEMail );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByProjectURLIdx( ICFKeyHash256 CTenantId,
		String ProjectURL );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByPubURIIdx(ICFKeyHash256 CTenantId,
		String PublishURI );
}
