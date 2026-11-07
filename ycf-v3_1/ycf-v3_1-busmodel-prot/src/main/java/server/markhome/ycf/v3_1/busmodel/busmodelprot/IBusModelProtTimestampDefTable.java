
// Description: Java 25 protlic DbIO interface for TimestampDef.

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
 *	BusModelProtTimestampDefTable protlic database interface for TimestampDef has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtTimestampDefTable
extends IBusModelProtAtomTable,
	IBusModelPubTimestampDefTable
{
	public static final String TABLE_NAME = "TimestampDef";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtTimestampDef protcreateTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelProtTimestampDef rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtTimestampDef protcreateTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelPubTimestampDef rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtTimestampDef protupdateTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelProtTimestampDef rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtTimestampDef protupdateTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelPubTimestampDef rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelProtTimestampDef rec );
	/**
	 *	Delete the TimestampDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTimestampDefByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TimestampDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the TimestampDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TimestampDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the TimestampDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the TimestampDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByNextIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the TimestampDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 */
	public void protdeleteTimestampDefByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the TimestampDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the TimestampDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTimestampDefByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTimestampDef( ISecurePubAuthorization Authorization,
		IBusModelPubTimestampDef rec );


	/**
	 *	Read the derived TimestampDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTimestampDef protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived TimestampDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTimestampDef protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all TimestampDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived TimestampDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTimestampDef protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived TimestampDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTimestampDef protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimestampDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTimestampDef[] protreadDerivedByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read the specific TimestampDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific TimestampDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific TimestampDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TimestampDef instances in the database accessible for the Authorization.
	 */
	public IBusModelProtTimestampDef[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific TimestampDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific TimestampDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimestampDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTimestampDef[] protreadRecByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtTimestampDef protmoveRecUp( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtTimestampDef protmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
