
// Description: Java 25 public DbIO interface for IndexTweak.

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
 *	BusModelPubIndexTweakTable public database interface for IndexTweak has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubIndexTweakTable
{
	public static final String TABLE_NAME = "IndexTweak";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelPubIndexTweak pubcreateIndexTweak( ISecurePubAuthorization Authorization,
		IBusModelPubIndexTweak rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelPubIndexTweak pubupdateIndexTweak( ISecurePubAuthorization Authorization,
		IBusModelPubIndexTweak rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteIndexTweak( ISecurePubAuthorization Authorization,
		IBusModelPubIndexTweak rec );
	/**
	 *	Delete the IndexTweak instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argIndexId );

	/**
	 *	Delete the IndexTweak instances identified by the key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelPubIndexTweakByIndexIdxKey argKey );
	/**
	 *	Delete the IndexTweak instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteIndexTweakByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the IndexTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTweakByUNameIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByValTentIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTenantId );

	/**
	 *	Delete the IndexTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByValTentIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTweakByValTentIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argScopeId );

	/**
	 *	Delete the IndexTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTweakByScopeIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the IndexTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTweakByDefSchemaIdxKey argKey );
	/**
	 *	Delete the IndexTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 */
	public void pubdeleteIndexTweakByUDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTenantId,
		CFDbKeyHash256 argScopeId,
		CFDbKeyHash256 argDefSchemaTenantId,
		CFDbKeyHash256 argDefSchemaId,
		String argName );

	/**
	 *	Delete the IndexTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteIndexTweakByUDefIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTweakByUDefIdxKey argKey );


	/**
	 *	Read the derived IndexTweak record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubIndexTweak pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived IndexTweak record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubIndexTweak publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all IndexTweak instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelPubIndexTweak[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived IndexTweak record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubIndexTweak pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the derived IndexTweak record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubIndexTweak pubreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived IndexTweak record instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubIndexTweak[] pubreadDerivedByValTentIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived IndexTweak record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubIndexTweak[] pubreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived IndexTweak record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubIndexTweak[] pubreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read the derived IndexTweak record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubIndexTweak pubreadDerivedByUDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Read an array of the derived IndexTweak record instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubIndexTweak[] pubreadDerivedByIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 IndexId );

	/**
	 *	Read the specific IndexTweak record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific IndexTweak record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the IndexTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific IndexTweak record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific IndexTweak instances in the database accessible for the Authorization.
	 */
	public IBusModelPubIndexTweak[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific IndexTweak record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read the specific IndexTweak record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak pubreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific IndexTweak record instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak[] pubreadRecByValTentIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific IndexTweak record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak[] pubreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific IndexTweak record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak[] pubreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read the specific IndexTweak record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak pubreadRecByUDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId,
		CFDbKeyHash256 ScopeId,
		CFDbKeyHash256 DefSchemaTenantId,
		CFDbKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Read an array of the specific IndexTweak record instances identified by the duplicate key IndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	IndexId	The IndexTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubIndexTweak[] pubreadRecByIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 IndexId );
}
