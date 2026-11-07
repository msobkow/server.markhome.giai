
// Description: Java 25 protlic DbIO interface for NumberDef.

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
 *	BusModelProtNumberDefTable protlic database interface for NumberDef has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtNumberDefTable
extends IBusModelProtAtomTable,
	IBusModelPubNumberDefTable
{
	public static final String TABLE_NAME = "NumberDef";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtNumberDef protcreateNumberDef( ISecurePubAuthorization Authorization,
		IBusModelProtNumberDef rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtNumberDef protcreateNumberDef( ISecurePubAuthorization Authorization,
		IBusModelPubNumberDef rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtNumberDef protupdateNumberDef( ISecurePubAuthorization Authorization,
		IBusModelProtNumberDef rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtNumberDef protupdateNumberDef( ISecurePubAuthorization Authorization,
		IBusModelPubNumberDef rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteNumberDef( ISecurePubAuthorization Authorization,
		IBusModelProtNumberDef rec );
	/**
	 *	Delete the NumberDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteNumberDefByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the NumberDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the NumberDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the NumberDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the NumberDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the NumberDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the NumberDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByNextIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByNextIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the NumberDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 */
	public void protdeleteNumberDefByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the NumberDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the NumberDef instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteNumberDefByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteNumberDef( ISecurePubAuthorization Authorization,
		IBusModelPubNumberDef rec );


	/**
	 *	Read the derived NumberDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NumberDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtNumberDef protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived NumberDef record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NumberDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtNumberDef protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all NumberDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived NumberDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtNumberDef protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived NumberDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtNumberDef protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived NumberDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtNumberDef[] protreadDerivedByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read the specific NumberDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NumberDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific NumberDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the NumberDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific NumberDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific NumberDef instances in the database accessible for the Authorization.
	 */
	public IBusModelProtNumberDef[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific NumberDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific NumberDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific NumberDef record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The NumberDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtNumberDef[] protreadRecByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtNumberDef protmoveRecUp( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtNumberDef protmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
