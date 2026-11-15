
// Description: Java 25 public DbIO interface for Table.

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
 *	BusModelPubTableTable public database interface for Table has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelPubTableTable
{
	public static final String TABLE_NAME = "Table";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelPubTable pubcreateTable( ISecurePubAuthorization Authorization,
		IBusModelPubTable rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelPubTable pubupdateTable( ISecurePubAuthorization Authorization,
		IBusModelPubTable rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void pubdeleteTable( ISecurePubAuthorization Authorization,
		IBusModelPubTable rec );
	/**
	 *	Delete the Table instances identified by the key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableBySchemaDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSchemaDefId );

	/**
	 *	Delete the Table instances identified by the key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableBySchemaDefIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableBySchemaDefIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByCodeVisIdx( ISecurePubAuthorization Authorization,
		IBusModelPubSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Table instances identified by the key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByCodeVisIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByCodeVisIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableBySchemaCodeVisIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum argCodeVis );

	/**
	 *	Delete the Table instances identified by the key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableBySchemaCodeVisIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableBySchemaCodeVisIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the Table instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByDefSchemaIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSchemaDefId,
		String argName );

	/**
	 *	Delete the Table instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByUNameIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableBySchemaCdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argSchemaDefId,
		String argTableClassCode );

	/**
	 *	Delete the Table instances identified by the key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableBySchemaCdIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableBySchemaCdIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByPrimaryIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrimaryIndexId );

	/**
	 *	Delete the Table instances identified by the key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByPrimaryIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByPrimaryIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByLookupIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argLookupIndexId );

	/**
	 *	Delete the Table instances identified by the key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByLookupIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByLookupIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByAltIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argAltIndexId );

	/**
	 *	Delete the Table instances identified by the key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByAltIndexIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByAltIndexIdxKey argKey );
	/**
	 *	Delete the Table instances identified by the key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByQualTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argQualifyingTableId );

	/**
	 *	Delete the Table instances identified by the key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByQualTableIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTableByQualTableIdxKey argKey );
	/**
	 *	Delete the Table instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void pubdeleteTableByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argKey );
	/**
	 *	Delete the Table instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 */
	public void pubdeleteTableByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argTenantId );

	/**
	 *	Delete the Table instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void pubdeleteTableByTenantIdx( ISecurePubAuthorization Authorization,
		IBusModelPubScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived Table record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubTable pubreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the derived Table record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubTable publockDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all Table instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadPubAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived Table record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubTable pubreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedBySchemaDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByCodeVisIdx( ISecurePubAuthorization Authorization,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedBySchemaCodeVisIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read the derived Table record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubTable pubreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Read the derived Table record instance identified by the unique key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelPubTable pubreadDerivedBySchemaCdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByPrimaryIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrimaryIndexId );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByLookupIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 LookupIndexId );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByAltIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 AltIndexId );

	/**
	 *	Read an array of the derived Table record instances identified by the duplicate key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelPubTable[] pubreadDerivedByQualTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 QualifyingTableId );

	/**
	 *	Read the specific Table record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable pubreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Lock the specific Table record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Table instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable publockRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 PKey );

	/**
	 *	Read all the specific Table record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Table instances in the database accessible for the Authorization.
	 */
	public IBusModelPubTable[] pubreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific Table record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable pubreadRecByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 Id );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByTenantIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 TenantId );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key SchemaDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecBySchemaDefIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key CodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByCodeVisIdx( ISecurePubAuthorization Authorization,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key SchemaCodeVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	CodeVis	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecBySchemaCodeVisIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		IBusModelPubSchema.CodeVisibilityEnum CodeVis );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read the specific Table record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	Name	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable pubreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		String Name );

	/**
	 *	Read the specific Table record instance identified by the unique key SchemaCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The Table key attribute of the instance generating the id.
	 *
	 *	@param	TableClassCode	The Table key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable pubreadRecBySchemaCdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 SchemaDefId,
		String TableClassCode );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key PrimaryIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrimaryIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByPrimaryIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrimaryIndexId );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key LookupIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LookupIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByLookupIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 LookupIndexId );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key AltIndexIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	AltIndexId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByAltIndexIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 AltIndexId );

	/**
	 *	Read an array of the specific Table record instances identified by the duplicate key QualTableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	QualifyingTableId	The Table key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelPubTable[] pubreadRecByQualTableIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 QualifyingTableId );
}
