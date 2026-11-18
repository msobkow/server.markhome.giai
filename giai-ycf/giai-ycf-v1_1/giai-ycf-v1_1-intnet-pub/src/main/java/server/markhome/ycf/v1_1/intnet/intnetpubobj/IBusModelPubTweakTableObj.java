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

public interface IBusModelPubTweakTableObj
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
	 *	Instantiate a new Tweak instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubTweakObj newInstance();

	/**
	 *	Instantiate a new Tweak edition of the specified Tweak instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubTweakEditObj newEditInstance( IBusModelPubTweakObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelPubTweakObj instance, which may be a subclass of a Tweak instance.
	 */
	IBusModelPubTweakObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTweakObj realiseTweak( IBusModelPubTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTweakObj createTweak( IBusModelPubTweakObj Obj );

	/**
	 *	Read a Tweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTweakObj readTweak( ICFKeyHash256 pkey );

	/**
	 *	Read a Tweak-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Tweak-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubTweakObj readTweak( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubTweakObj readCachedTweak( ICFKeyHash256 pkey );

	public void reallyDeepDisposeTweak( IBusModelPubTweakObj obj );

	void deepDisposeTweak( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTweakObj lockTweak( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Tweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTweakObj> readAllTweak();

	/**
	 *	Return a sorted map of all the Tweak-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubTweakObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubTweakObj> readAllTweak( boolean forceRead );

	List<IBusModelPubTweakObj> readCachedAllTweak();

	/**
	 *	Get the BusModelPubTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubTweakObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubTweakObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByValTentIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate ValTentIdx key.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate ValTentIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByValTentIdx( CFDbKeyHash256 TenantId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubTweakObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubTweakObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubTweakObj> readTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelPubTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj cached instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByUDefIdx(CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Get the BusModelPubTweakObj instance for the unique UDefIdx key.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubTweakObj refreshed instance for the unique UDefIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubTweakObj readTweakByUDefIdx(CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name,
		boolean forceRead );

	IBusModelPubTweakObj readCachedTweakByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubTweakObj readCachedTweakByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubTweakObj> readCachedTweakByValTentIdx( CFDbKeyHash256 TenantId );

	List<IBusModelPubTweakObj> readCachedTweakByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubTweakObj> readCachedTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelPubTweakObj readCachedTweakByUDefIdx( CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	void deepDisposeTweakByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeTweakByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeTweakByValTentIdx( CFDbKeyHash256 TenantId );

	void deepDisposeTweakByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeTweakByUDefIdx( CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Internal use only.
	 */
	IBusModelPubTweakObj updateTweak( IBusModelPubTweakObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteTweak( IBusModelPubTweakObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByUNameIdx(CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByValTentIdx( CFDbKeyHash256 TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The Tweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Tweak key attribute of the instance generating the id.
	 */
	void deleteTweakByUDefIdx(CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );
}
