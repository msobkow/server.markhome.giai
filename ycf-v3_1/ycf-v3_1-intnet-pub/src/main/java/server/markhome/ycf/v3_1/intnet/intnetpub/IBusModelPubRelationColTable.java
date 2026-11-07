
// Description: Java 25 public DbIO interface for RelationCol.

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

package server.markhome.ycf.v3_1.intnet.intnetpub;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.intnet.intnetpub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.busmodel.busmodelpubobj.*;

/*
 *	BusModelPubRelationColTable public database interface for RelationCol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubRelationColTable
{
	public static final String TABLE_NAME = "RelationCol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelPubRelationCol pubcreateRelationCol( ISecurePubAuthorization Authorization,
		IBusModelPubRelationCol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelPubRelationCol pubupdateRelationCol( ISecurePubAuthorization Authorization,
		IBusModelPubRelationCol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteRelationCol( ISecurePubAuthorization Authorization,
		IBusModelPubRelationCol rec );
	/**
	 *	Delete the RelationCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteRelationColByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the RelationCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argRelationId,
		String argName );

	/**
	 *	Delete the RelationCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByUNameIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argRelationId );

	/**
	 *	Delete the RelationCol instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByRelationIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByRelationIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the RelationCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByDefSchemaIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByFromColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argFromColId );

	/**
	 *	Delete the RelationCol instances identified by the key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByFromColIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByFromColIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByToColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argToColId );

	/**
	 *	Delete the RelationCol instances identified by the key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByToColIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByToColIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the RelationCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByPrevIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the RelationCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByNextIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByRelPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argRelationId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the RelationCol instances identified by the key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByRelPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByRelPrevIdxKey argKey );
	/**
	 *	Delete the RelationCol instances identified by the key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 */
	public void pubdeleteRelationColByRelNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argRelationId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the RelationCol instances identified by the key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteRelationColByRelNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubRelationColByRelNextIdxKey argKey );


	/**
	 *	Read the derived RelationCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubRelationCol pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived RelationCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubRelationCol publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all RelationCol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived RelationCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubRelationCol pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the derived RelationCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubRelationCol pubreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		String Name );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByFromColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 FromColId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByToColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ToColId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByRelPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived RelationCol record instances identified by the duplicate key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubRelationCol[] pubreadDerivedByRelNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read the specific RelationCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific RelationCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RelationCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific RelationCol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RelationCol instances in the database accessible for the Authorization.
	 */
	public IBusModelPubRelationCol[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific RelationCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the specific RelationCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol pubreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		String Name );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key FromColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	FromColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByFromColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 FromColId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key ToColIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ToColId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByToColIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ToColId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key RelPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByRelPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific RelationCol record instances identified by the duplicate key RelNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The RelationCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubRelationCol[] pubreadRecByRelNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelPubRelationCol pubmoveRecUp( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelPubRelationCol pubmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
