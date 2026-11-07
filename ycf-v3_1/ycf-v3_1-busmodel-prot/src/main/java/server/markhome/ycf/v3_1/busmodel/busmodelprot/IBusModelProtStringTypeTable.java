
// Description: Java 25 protlic DbIO interface for StringType.

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
 *	BusModelProtStringTypeTable protlic database interface for StringType has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelProtStringTypeTable
extends IBusModelProtStringDefTable,
	IBusModelPubStringTypeTable
{
	public static final String TABLE_NAME = "StringType";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtStringType protcreateStringType( ISecurePubAuthorization Authorization,
		IBusModelProtStringType rec );

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public IBusModelProtStringType protcreateStringType( ISecurePubAuthorization Authorization,
		IBusModelPubStringType rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtStringType protupdateStringType( ISecurePubAuthorization Authorization,
		IBusModelProtStringType rec );

	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public IBusModelProtStringType protupdateStringType( ISecurePubAuthorization Authorization,
		IBusModelPubStringType rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteStringType( ISecurePubAuthorization Authorization,
		IBusModelProtStringType rec );
	/**
	 *	Delete the StringType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId );

	/**
	 *	Delete the StringType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtStringTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeBySchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubStringTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the StringType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteStringTypeByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the StringType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the StringType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByUNameIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByUNameIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByUNameIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the StringType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByScopeIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByScopeIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByScopeIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argDefSchemaId );

	/**
	 *	Delete the StringType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByDefSchemaIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the StringType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByPrevIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByPrevIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the StringType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByNextIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByNextIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argPrevId );

	/**
	 *	Delete the StringType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContPrevIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByContPrevIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContPrevIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 */
	public void protdeleteStringTypeByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		CFDbKeyHash256 argNextId );

	/**
	 *	Delete the StringType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelProtValueByContNextIdxKey argKey );
	/**
	 *	Delete the StringType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteStringTypeByContNextIdx( ISecurePubAuthorization Authorization,
		IBusModelPubValueByContNextIdxKey argKey );

	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteStringType( ISecurePubAuthorization Authorization,
		IBusModelPubStringType rec );


	/**
	 *	Read the derived StringType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the StringType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtStringType protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived StringType record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the StringType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtStringType protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all StringType instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived StringType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The StringType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtStringType protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived StringType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public IBusModelProtStringType protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the derived StringType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public IBusModelProtStringType[] protreadDerivedBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Read the specific StringType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the StringType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific StringType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the StringType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific StringType record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific StringType instances in the database accessible for the Authorization.
	 */
	public IBusModelProtStringType[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific StringType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The StringType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific StringType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The StringType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByScopeIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByDefSchemaIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByPrevIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByNextIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByContPrevIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 PrevId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The StringType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecByContNextIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		CFDbKeyHash256 NextId );

	/**
	 *	Read an array of the specific StringType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The StringType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public IBusModelProtStringType[] protreadRecBySchemaIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtStringType protmoveRecUp( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	public IBusModelProtStringType protmoveRecDown( ISecurePubAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
