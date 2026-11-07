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

public interface IBusModelChainTableObj
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
	 *	Instantiate a new Chain instance.
	 *
	 *	@return	A new instance.
	 */
	IBusModelChainObj newInstance();

	/**
	 *	Instantiate a new Chain edition of the specified Chain instance.
	 *
	 *	@return	A new edition.
	 */
	IBusModelChainEditObj newEditInstance( IBusModelChainObj orig );

	/**
	 *	Construct an appropriate subclass instance based on the specified class code.
	 *
	 *	@param	backingClassCode	The backing store class code used to identify the proposed instance class.
	 *
	 *	@return	IBusModelChainObj instance, which may be a subclass of a Chain instance.
	 */
	IBusModelChainObj constructByClassCode( int backingClassCode );

	/**
	 *	Internal use only.
	 */
	IBusModelChainObj realiseChain( IBusModelChainObj Obj );

	/**
	 *	Internal use only.
	 */
	IBusModelChainObj createChain( IBusModelChainObj Obj );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelChainObj readChain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Read a Chain-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The Chain-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IBusModelChainObj readChain( $implCommaIJavaOptAtomType$ pkey,
		boolean forceRead );

	IBusModelChainObj readCachedChain( $implCommaIJavaOptAtomType$ pkey );

	public void reallyDeepDisposeChain( IBusModelChainObj obj );

	void deepDisposeChain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Internal use only.
	 */
	IBusModelChainObj lockChain( $implCommaIJavaOptAtomType$ pkey );

	/**
	 *	Return a sorted list of all the Chain-derived instances in the database.
	 *
	 *	@return	List of IBusModelChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelChainObj> readAllChain();

	/**
	 *	Return a sorted map of all the Chain-derived instances in the database.
	 *
	 *	@return	List of IBusModelChainObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IBusModelChainObj> readAllChain( boolean forceRead );

	List<IBusModelChainObj> readCachedAllChain();

	/**
	 *	Get the BusModelChainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	BusModelChainObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelChainObj readChainByIdIdx( ICFKeyHash256 Id );

	/**
	 *	Get the BusModelChainObj instance for the primary key attributes.
	 *
	 *	@param	Id	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	BusModelChainObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IBusModelChainObj readChainByIdIdx( ICFKeyHash256 Id,
		boolean forceRead );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByChainTableIdx( ICFKeyHash256 TableId );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate ChainTableIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate ChainTableIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByChainTableIdx( ICFKeyHash256 TableId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate DefSchemaIdx key.
	 *
	 *	@param	DefSchemaId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate DefSchemaIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByDefSchemaIdx( ICFKeyHash256 DefSchemaId,
		boolean forceRead );

	/**
	 *	Get the BusModelChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	BusModelChainObj cached instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelChainObj readChainByUNameIdx(ICFKeyHash256 TableId,
		String Name );

	/**
	 *	Get the BusModelChainObj instance for the unique UNameIdx key.
	 *
	 *	@param	TableId	The Chain key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	BusModelChainObj refreshed instance for the unique UNameIdx key, or
	 *		null if no such instance exists.
	 */
	IBusModelChainObj readChainByUNameIdx(ICFKeyHash256 TableId,
		String Name,
		boolean forceRead );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	PrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate PrevRelIdx key.
	 *
	 *	@param	PrevRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate PrevRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByPrevRelIdx( ICFKeyHash256 PrevRelationId,
		boolean forceRead );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	NextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	/**
	 *	Get the map of BusModelChainObj instances sorted by their primary keys for the duplicate NextRelIdx key.
	 *
	 *	@param	NextRelationId	The Chain key attribute of the instance generating the id.
	 *
	 *	@return	List of BusModelChainObj cached instances sorted by their primary keys for the duplicate NextRelIdx key,
	 *		which may be an empty set.
	 */
	List<IBusModelChainObj> readChainByNextRelIdx( ICFKeyHash256 NextRelationId,
		boolean forceRead );

	IBusModelChainObj readCachedChainByIdIdx( ICFKeyHash256 Id );

	List<IBusModelChainObj> readCachedChainByChainTableIdx( ICFKeyHash256 TableId );

	List<IBusModelChainObj> readCachedChainByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	IBusModelChainObj readCachedChainByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	List<IBusModelChainObj> readCachedChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	List<IBusModelChainObj> readCachedChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	void deepDisposeChainByIdIdx( ICFKeyHash256 Id );

	void deepDisposeChainByChainTableIdx( ICFKeyHash256 TableId );

	void deepDisposeChainByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

	void deepDisposeChainByUNameIdx( ICFKeyHash256 TableId,
		String Name );

	void deepDisposeChainByPrevRelIdx( ICFKeyHash256 PrevRelationId );

	void deepDisposeChainByNextRelIdx( ICFKeyHash256 NextRelationId );

	/**
	 *	Internal use only.
	 */
	IBusModelChainObj updateChain( IBusModelChainObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteChain( IBusModelChainObj Obj );

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
	void deleteChainByDefSchemaIdx( ICFKeyHash256 DefSchemaId );

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
