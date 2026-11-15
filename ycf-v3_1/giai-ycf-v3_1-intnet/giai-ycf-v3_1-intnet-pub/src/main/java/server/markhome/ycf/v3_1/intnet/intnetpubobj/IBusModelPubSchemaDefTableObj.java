// Description: Java 25 Public Table Object interface for BusModelPub.

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

package server.markhome.ycf.v3_1.intnet.intnetpubobj;

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
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;

public interface IBusModelPubSchemaDefTableObj
{
	public IBusModelPubSchemaObj getSchema();
	public void setSchema( IBusModelPubSchemaObj value );

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
	IBusModelPubSchemaDefObj newInstance();

	/**
	 *	Instantiate a new SchemaDef edition of the specified SchemaDef instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubSchemaDefEditObj newEditInstance( IBusModelPubSchemaDefObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaDefObj realiseSchemaDef( IBusModelPubSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaDefObj createSchemaDef( IBusModelPubSchemaDefObj Obj );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDef( ICFKeyHash256 pkey );

	/**
	 *	Read a SchemaDef-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The SchemaDef-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDef( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubSchemaDefObj readCachedSchemaDef( ICFKeyHash256 pkey );

	public void reallyDeepDisposeSchemaDef( IBusModelPubSchemaDefObj obj );

	void deepDisposeSchemaDef( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaDefObj lockSchemaDef( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readAllSchemaDef();

	/**
	 *	Return a sorted map of all the SchemaDef-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubSchemaDefObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readAllSchemaDef( boolean forceRead );

	List<IBusModelPubSchemaDefObj> readCachedAllSchemaDef();

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubScopeObj instance for the primary key attributes.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubScopeObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubScopeObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByTenantIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByCTenantIdx( CFDbKeyHash256 CTenantId );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate CTenantIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate CTenantIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByCTenantIdx( CFDbKeyHash256 CTenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByMinorVersionIdx( CFDbKeyHash256 MinorVersionId );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate MinorVersionIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate MinorVersionIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByMinorVersionIdx( CFDbKeyHash256 MinorVersionId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaDefObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByUNameIdx(CFDbKeyHash256 MinorVersionId,
		String Name );

	/**
	 *	Get the BusModelPubSchemaDefObj instance for the unique UNameIdx key.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaDefObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByUNameIdx(CFDbKeyHash256 MinorVersionId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByAuthEMailIdx( CFDbKeyHash256 CTenantId,
		String AuthorEMail );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate AuthEMailIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate AuthEMailIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByAuthEMailIdx( CFDbKeyHash256 CTenantId,
		String AuthorEMail,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByProjectURLIdx( CFDbKeyHash256 CTenantId,
		String ProjectURL );

	/**
	 *	Get the map of BusModelPubSchemaDefObj instances sorted by their primary keys for the duplicate ProjectURLIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubSchemaDefObj cached instances sorted by their primary keys for the duplicate ProjectURLIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubSchemaDefObj> readSchemaDefByProjectURLIdx( CFDbKeyHash256 CTenantId,
		String ProjectURL,
		boolean forceRead );

	/**
	 *	Get the BusModelPubSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaDefObj cached instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByPubURIIdx(CFDbKeyHash256 CTenantId,
		String PublishURI );

	/**
	 *	Get the BusModelPubSchemaDefObj instance for the unique PubURIIdx key.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubSchemaDefObj refreshed instance for the unique PubURIIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubSchemaDefObj readSchemaDefByPubURIIdx(CFDbKeyHash256 CTenantId,
		String PublishURI,
		boolean forceRead );

	IBusModelPubSchemaDefObj readCachedSchemaDefByIdIdx( CFDbKeyHash256 Id );

	List<IBusModelPubSchemaDefObj> readCachedSchemaDefByTenantIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubSchemaDefObj> readCachedSchemaDefByCTenantIdx( CFDbKeyHash256 CTenantId );

	List<IBusModelPubSchemaDefObj> readCachedSchemaDefByMinorVersionIdx( CFDbKeyHash256 MinorVersionId );

	IBusModelPubSchemaDefObj readCachedSchemaDefByUNameIdx( CFDbKeyHash256 MinorVersionId,
		String Name );

	List<IBusModelPubSchemaDefObj> readCachedSchemaDefByAuthEMailIdx( CFDbKeyHash256 CTenantId,
		String AuthorEMail );

	List<IBusModelPubSchemaDefObj> readCachedSchemaDefByProjectURLIdx( CFDbKeyHash256 CTenantId,
		String ProjectURL );

	IBusModelPubSchemaDefObj readCachedSchemaDefByPubURIIdx( CFDbKeyHash256 CTenantId,
		String PublishURI );

	void deepDisposeSchemaDefByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeSchemaDefByTenantIdx( CFDbKeyHash256 TenantId );

	void deepDisposeSchemaDefByCTenantIdx( CFDbKeyHash256 CTenantId );

	void deepDisposeSchemaDefByMinorVersionIdx( CFDbKeyHash256 MinorVersionId );

	void deepDisposeSchemaDefByUNameIdx( CFDbKeyHash256 MinorVersionId,
		String Name );

	void deepDisposeSchemaDefByAuthEMailIdx( CFDbKeyHash256 CTenantId,
		String AuthorEMail );

	void deepDisposeSchemaDefByProjectURLIdx( CFDbKeyHash256 CTenantId,
		String ProjectURL );

	void deepDisposeSchemaDefByPubURIIdx( CFDbKeyHash256 CTenantId,
		String PublishURI );

	/**
	 *	Internal use only.
	 */
	IBusModelPubSchemaDefObj updateSchemaDef( IBusModelPubSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteSchemaDef( IBusModelPubSchemaDefObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByTenantIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByCTenantIdx( CFDbKeyHash256 CTenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByMinorVersionIdx( CFDbKeyHash256 MinorVersionId );

	/**
	 *	Internal use only.
	 *
	 *	@param	MinorVersionId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByUNameIdx(CFDbKeyHash256 MinorVersionId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	AuthorEMail	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByAuthEMailIdx( CFDbKeyHash256 CTenantId,
		String AuthorEMail );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	ProjectURL	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByProjectURLIdx( CFDbKeyHash256 CTenantId,
		String ProjectURL );

	/**
	 *	Internal use only.
	 *
	 *	@param	CTenantId	The SchemaDef key attribute of the instance generating the id.
	 *
	 *	@param	PublishURI	The SchemaDef key attribute of the instance generating the id.
	 */
	void deleteSchemaDefByPubURIIdx(CFDbKeyHash256 CTenantId,
		String PublishURI );
}
