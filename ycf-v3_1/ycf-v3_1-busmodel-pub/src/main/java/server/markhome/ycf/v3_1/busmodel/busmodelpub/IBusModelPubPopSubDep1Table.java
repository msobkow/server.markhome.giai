
// Description: Java 25 public DbIO interface for PopSubDep1.

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

package server.markhome.ycf.v3_1.busmodel.busmodelpub;

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
 *	BusModelPubPopSubDep1Table public database interface for PopSubDep1 has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubPopSubDep1Table
{
	public static final String TABLE_NAME = "PopSubDep1";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelPubPopSubDep1 pubcreatePopSubDep1( ISecurePubAuthorization Authorization,
		IBusModelPubPopSubDep1 rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelPubPopSubDep1 pubupdatePopSubDep1( ISecurePubAuthorization Authorization,
		IBusModelPubPopSubDep1 rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeletePopSubDep1( ISecurePubAuthorization Authorization,
		IBusModelPubPopSubDep1 rec );
	/**
	 *	Delete the PopSubDep1 instances identified by the key PopTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	public void pubdeletePopSubDep1ByPopTopDepIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPopTopDepId );

	/**
	 *	Delete the PopSubDep1 instances identified by the key PopTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeletePopSubDep1ByPopTopDepIdx( ISecurePubAuthorization Authorization,
		IBusModelPubPopSubDep1ByPopTopDepIdxKey argKey );
	/**
	 *	Delete the PopSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 */
	public void pubdeletePopSubDep1ByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPopTopDepId,
		String argName );

	/**
	 *	Delete the PopSubDep1 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeletePopSubDep1ByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubPopSubDep1ByUNameIdxKey argKey );
	/**
	 *	Delete the PopSubDep1 instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	public void pubdeletePopSubDep1ByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argRelationId );

	/**
	 *	Delete the PopSubDep1 instances identified by the key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeletePopSubDep1ByRelationIdx( ISecurePubAuthorization Authorization,
		IBusModelPubPopDepByRelationIdxKey argKey );
	/**
	 *	Delete the PopSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	public void pubdeletePopSubDep1ByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the PopSubDep1 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeletePopSubDep1ByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubPopDepByDefSchemaIdxKey argKey );
	/**
	 *	Delete the PopSubDep1 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeletePopSubDep1ByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the PopSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 */
	public void pubdeletePopSubDep1ByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTenantId );

	/**
	 *	Delete the PopSubDep1 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeletePopSubDep1ByTenantIdx( ISecurePubAuthorization Authorization,
		IBusModelPubScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived PopSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep1 instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubPopSubDep1 pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived PopSubDep1 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubPopSubDep1 publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all PopSubDep1 instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelPubPopSubDep1[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived PopSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubPopSubDep1 pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the derived PopSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubPopSubDep1[] pubreadDerivedByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived PopSubDep1 record instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubPopSubDep1[] pubreadDerivedByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId );

	/**
	 *	Read an array of the derived PopSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubPopSubDep1[] pubreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived PopSubDep1 record instances identified by the duplicate key PopTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubPopSubDep1[] pubreadDerivedByPopTopDepIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PopTopDepId );

	/**
	 *	Read the derived PopSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubPopSubDep1 pubreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PopTopDepId,
		String Name );

	/**
	 *	Read the specific PopSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1 pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific PopSubDep1 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the PopSubDep1 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1 publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific PopSubDep1 record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific PopSubDep1 instances in the database accessible for the Authorization.
	 */
	public IBusModelPubPopSubDep1[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific PopSubDep1 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1 pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the specific PopSubDep1 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1[] pubreadRecByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific PopSubDep1 record instances identified by the duplicate key RelationIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1[] pubreadRecByRelationIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 RelationId );

	/**
	 *	Read an array of the specific PopSubDep1 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1[] pubreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific PopSubDep1 record instances identified by the duplicate key PopTopDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1[] pubreadRecByPopTopDepIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PopTopDepId );

	/**
	 *	Read the specific PopSubDep1 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PopTopDepId	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The PopSubDep1 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubPopSubDep1 pubreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PopTopDepId,
		String Name );
}
