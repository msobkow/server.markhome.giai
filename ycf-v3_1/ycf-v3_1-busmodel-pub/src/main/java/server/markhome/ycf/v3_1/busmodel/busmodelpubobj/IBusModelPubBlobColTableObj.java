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

package server.markhome.ycf.v3_1.busmodel.busmodelpubobj;

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

public interface IBusModelPubBlobColTableObj
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
	 *	Instantiate a new BlobCol instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelPubBlobColObj newInstance();

	/**
	 *	Instantiate a new BlobCol edition of the specified BlobCol instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelPubBlobColEditObj newEditInstance( IBusModelPubBlobColObj orig );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBlobColObj realiseBlobCol( IBusModelPubBlobColObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBlobColObj createBlobCol( IBusModelPubBlobColObj Obj );

	/**
	 *	Read a BlobCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBlobColObj readBlobCol( ICFKeyHash256 pkey );

	/**
	 *	Read a BlobCol-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The BlobCol-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelPubBlobColObj readBlobCol( ICFKeyHash256 pkey,
		boolean forceRead );

	IBusModelPubBlobColObj readCachedBlobCol( ICFKeyHash256 pkey );

	public void reallyDeepDisposeBlobCol( IBusModelPubBlobColObj obj );

	void deepDisposeBlobCol( ICFKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBlobColObj lockBlobCol( ICFKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the BlobCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBlobColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBlobColObj> readAllBlobCol();

	/**
	 *	Return a sorted map of all the BlobCol-derived instances in the database.
	 *
	 *	@return	List of IBusModelPubBlobColObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelPubBlobColObj> readAllBlobCol( boolean forceRead );

	List<IBusModelPubBlobColObj> readCachedAllBlobCol();

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBlobColObj readBlobColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Get the BusModelPubValueObj instance for the primary key attributes.
	 *
	 *	@param	Id	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBlobColObj readBlobColByIdIdx( CFDbKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBlobColObj readBlobColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Get the BusModelPubValueObj instance for the unique UNameIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	BusModelPubValueObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelPubBlobColObj readBlobColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate ScopeIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ScopeIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByScopeIdx( CFDbKeyHash256 ScopeId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate PrevIdx key.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate PrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByPrevIdx( CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate NextIdx key.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate NextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByNextIdx( CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate ContPrevIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ContPrevIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubValueObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate ContNextIdx key.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate ContNextIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Get the map of BusModelPubBlobColObj instances sorted by their primary keys for the duplicate TableIdx key.
	 *
	 *	@param	TableId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelPubBlobColObj cached instances sorted by their primary keys for the duplicate TableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelPubBlobColObj> readBlobColByTableIdx( CFDbKeyHash256 TableId,
		boolean forceRead );

	IBusModelPubBlobColObj readCachedBlobColByIdIdx( CFDbKeyHash256 Id );

	IBusModelPubBlobColObj readCachedBlobColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	List<IBusModelPubBlobColObj> readCachedBlobColByScopeIdx( CFDbKeyHash256 ScopeId );

	List<IBusModelPubBlobColObj> readCachedBlobColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	List<IBusModelPubBlobColObj> readCachedBlobColByPrevIdx( CFDbKeyHash256 PrevId );

	List<IBusModelPubBlobColObj> readCachedBlobColByNextIdx( CFDbKeyHash256 NextId );

	List<IBusModelPubBlobColObj> readCachedBlobColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	List<IBusModelPubBlobColObj> readCachedBlobColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	List<IBusModelPubBlobColObj> readCachedBlobColByTableIdx( CFDbKeyHash256 TableId );

	void deepDisposeBlobColByIdIdx( CFDbKeyHash256 Id );

	void deepDisposeBlobColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	void deepDisposeBlobColByScopeIdx( CFDbKeyHash256 ScopeId );

	void deepDisposeBlobColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeBlobColByPrevIdx( CFDbKeyHash256 PrevId );

	void deepDisposeBlobColByNextIdx( CFDbKeyHash256 NextId );

	void deepDisposeBlobColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	void deepDisposeBlobColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	void deepDisposeBlobColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Internal use only.
	 */
	IBusModelPubBlobColObj updateBlobCol( IBusModelPubBlobColObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteBlobCol( IBusModelPubBlobColObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByIdIdx( CFDbKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByUNameIdx( CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByScopeIdx( CFDbKeyHash256 ScopeId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByPrevIdx( CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByNextIdx( CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByContPrevIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Internal use only.
	 *
	 *	@param	ScopeId	The BlobCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByContNextIdx( CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The BlobCol key attribute of the instance generating the id.
	 */
	void deleteBlobColByTableIdx( CFDbKeyHash256 TableId );

	/**
	 *	Move the BusModelPubBlobColObj instance up in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBlobColObj refreshed cache instance.
	 */
	IBusModelPubBlobColObj moveUpBlobCol( IBusModelPubBlobColObj Obj );

	/**
	 *	Move the BusModelPubBlobColObj instance down in the chain.  The instance is always refreshed.
	 *
	 *	@return	BusModelPubBlobColObj refreshed cache instance.
	 */
	IBusModelPubBlobColObj moveDownBlobCol( IBusModelPubBlobColObj Obj );
}
