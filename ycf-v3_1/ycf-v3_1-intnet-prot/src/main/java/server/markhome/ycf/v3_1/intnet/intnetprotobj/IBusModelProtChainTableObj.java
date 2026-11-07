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

public interface IBusModelProtChainTableObj
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
	 *	Instantiate a new Chain instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelProtChainObj newInstance();

	/**
	 *	Instantiate a new Chain edition of the specified Chain instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelProtChainEditObj newEditInstance( IBusModelProtChainObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelProtChainEditObj instance, which may be a subclass of a Chain instance.
	 */
	IBusModelProtChainObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelProtChainObj realiseChain( IBusModelProtChainObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelProtChainObj createChain( IBusModelProtChainObj Obj );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtChainObj readChain( CFDbKeyHash256 pkey );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelProtChainObj readChain( CFDbKeyHash256 pkey,
		boolean forceRead );

	IBusModelProtChainObj readCachedChain( CFDbKeyHash256 pkey );

	public void reallyDeepDisposeChain( IBusModelProtChainObj obj );

	void deepDisposeChain( CFDbKeyHash256 pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelProtChainObj lockChain( CFDbKeyHash256 pkey );

	/**
	 *	Return a sorted list of all the Chain-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtChainObj> readAllChain();

	/**
	 *	Return a sorted map of all the Chain-derived instances in the database.
	 *
	 *	@return	List of IBusModelProtChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelProtChainObj> readAllChain( boolean forceRead );

	List<IBusModelProtChainObj> readCachedAllChain();

	/**
	 *	Get the IBusModelProtChainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtChainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtChainObj readChainByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the IBusModelProtChainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtChainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtChainObj readChainByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByChainTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByChainTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByDefSchemaIdx( CFDbKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the IBusModelProtChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtChainObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtChainObj readChainByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the IBusModelProtChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	IBusModelProtChainObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelProtChainObj readChainByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	PrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	PrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByPrevRelIdx( ICFKeyHash256 PrevRelationId,
		boolean forceRead );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	NextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	/**
	 *	Get the map of List<IBusModelProtChainObj> instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	NextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of List<IBusModelProtChainObj> cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelProtChainObj> readChainByNextRelIdx( ICFKeyHash256 NextRelationId,
		boolean forceRead );

	IBusModelProtChainObj readCachedChainByIdIdx( ICFKeyHash256 Id );

	List<List<IBusModelProtChainObj>> readCachedChainByChainTableIdx( ICFKeyHash256 TableId );

	List<List<IBusModelProtChainObj>> readCachedChainByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	IBusModelProtChainObj readCachedChainByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<List<IBusModelProtChainObj>> readCachedChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	List<List<IBusModelProtChainObj>> readCachedChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	void deepDisposeChainByIdIdx( ICFKeyHash256 Id );

	void deepDisposeChainByChainTableIdx( ICFKeyHash256 TableId );

	void deepDisposeChainByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	void deepDisposeChainByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	void deepDisposeChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	/**
	 *	Internal use only.
	 */
	IBusModelProtChainObj updateChain( IBusModelProtChainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteChain( IBusModelProtChainObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	Id	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByChainTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Internal use only.
	 *
	 *	@param	DefSchemaId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByDefSchemaIdx( CFDbKeyHash256 DefSchemaId );

	/**
	 *	Internal use only.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Internal use only.
	 *
	 *	@param	PrevRelationId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	/**
	 *	Internal use only.
	 *
	 *	@param	NextRelationId	The Chain key attribute of the instance generating the id.
	 */
	void deleteChainByNextRelIdx( ICFKeyHash256 NextRelationId );
}
