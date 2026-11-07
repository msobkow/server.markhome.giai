
// Description: Java 25 protlic DbIO interface for IndexCol.

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

package server.markhome.ycf.v3_1.busmodel.busmodelprot;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
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
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	BusModelProtIndexColTable protlic database interface for IndexCol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtIndexColTable
extends IBusModelPubIndexColTable
{
	public static final String TABLE_NAME = "IndexCol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtIndexCol protcreateIndexCol( ISecurePubAuthorization Authorization,
		IBusModelProtIndexCol rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtIndexCol protcreateIndexCol( ISecurePubAuthorization Authorization,
		IBusModelPubIndexCol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtIndexCol protupdateIndexCol( ISecurePubAuthorization Authorization,
		IBusModelProtIndexCol rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtIndexCol protupdateIndexCol( ISecurePubAuthorization Authorization,
		IBusModelPubIndexCol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteIndexCol( ISecurePubAuthorization Authorization,
		IBusModelProtIndexCol rec );
	/**
	 *	Delete the IndexCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteIndexColByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argIndexId,
		String argName );

	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByUNameIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByUNameIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByIndexIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argIndexId );

	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByIndexIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByIndexIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByColIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argColumnId );

	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByColIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByColIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByColIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByColIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByNextIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByNextIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByIdxPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argIndexId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIdxPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByIdxPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIdxPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByIdxPrevIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 */
	public void protdeleteIndexColByIdxNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argIndexId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIdxNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtIndexColByIdxNextIdxKey argKey );
	/**
	 *	Delete the IndexCol instances identified by the key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteIndexColByIdxNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexColByIdxNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteIndexCol( ISecurePubAuthorization Authorization,
		IBusModelPubIndexCol rec );


	/**
	 *	Read the derived IndexCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtIndexCol protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived IndexCol record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtIndexCol protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all IndexCol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived IndexCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtIndexCol protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived IndexCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtIndexCol protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		String Name );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByIndexIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByColIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ColumnId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByIdxPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived IndexCol record instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtIndexCol[] protreadDerivedByIdxNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read the specific IndexCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific IndexCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific IndexCol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexCol instances in the database accessible for the Authorization.
	 */
	public IBusModelProtIndexCol[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific IndexCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific IndexCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		String Name );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByIndexIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key ColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ColumnId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByColIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ColumnId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key IdxPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByIdxPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific IndexCol record instances identified by the duplicate key IdxNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The IndexCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtIndexCol[] protreadRecByIdxNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 IndexId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtIndexCol protmoveRecUp( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtIndexCol protmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
