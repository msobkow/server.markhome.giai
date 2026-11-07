
// Description: Java 25 protlic DbIO interface for TZTimestampType.

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
 *	BusModelProtTZTimestampTypeTable protlic database interface for TZTimestampType has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtTZTimestampTypeTable
extends IBusModelProtTZTimestampDefTable,
	IBusModelPubTZTimestampTypeTable
{
	public static final String TABLE_NAME = "TZTimestampType";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtTZTimestampType protcreateTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelProtTZTimestampType rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtTZTimestampType protcreateTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelPubTZTimestampType rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtTZTimestampType protupdateTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelProtTZTimestampType rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtTZTimestampType protupdateTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelPubTZTimestampType rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelProtTZTimestampType rec );
	/**
	 *	Delete the TZTimestampType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId );

	/**
	 *	Delete the TZTimestampType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtTZTimestampTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubTZTimestampTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteTZTimestampTypeByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TZTimestampType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the TZTimestampType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TZTimestampType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the TZTimestampType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the TZTimestampType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByNextIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByNextIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the TZTimestampType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 */
	public void protdeleteTZTimestampTypeByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the TZTimestampType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the TZTimestampType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteTZTimestampTypeByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteTZTimestampType( ISecurePubAuthorization Authorization,
		IBusModelPubTZTimestampType rec );


	/**
	 *	Read the derived TZTimestampType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimestampType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTZTimestampType protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived TZTimestampType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTZTimestampType protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all TZTimestampType instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived TZTimestampType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTZTimestampType protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived TZTimestampType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtTZTimestampType protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived TZTimestampType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtTZTimestampType[] protreadDerivedBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Read the specific TZTimestampType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific TZTimestampType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TZTimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific TZTimestampType record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TZTimestampType instances in the database accessible for the Authorization.
	 */
	public IBusModelProtTZTimestampType[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific TZTimestampType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific TZTimestampType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific TZTimestampType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TZTimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtTZTimestampType[] protreadRecBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtTZTimestampType protmoveRecUp( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtTZTimestampType protmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
