
// Description: Java 25 DbIO interface for TimestampType.

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

package server.markhome.ycf.v3_1.intnet.intnet;

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

import server.markhome.ycf.v3_1.busmodel.busmodelprotobj.*;

/*
 *	BusModelTimestampTypeTable database interface for TimestampType has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelTimestampTypeTable
{
	public static final String TABLE_NAME = "TimestampType";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelTimestampType createTimestampType( ISecureAuthorization Authorization,
		IBusModelTimestampType rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelTimestampType updateTimestampType( ISecureAuthorization Authorization,
		IBusModelTimestampType rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteTimestampType( ISecureAuthorization Authorization,
		IBusModelTimestampType rec );
	/**
	 *	Delete the TimestampType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSchemaDefId );

	/**
	 *	Delete the TimestampType instances identified by the key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeBySchemaIdx( ISecureAuthorization Authorization,
		IBusModelTimestampTypeBySchemaIdxKey argKey );
	/**
	 *	Delete the TimestampType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTimestampTypeByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the TimestampType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TimestampType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByUNameIdx( ISecureAuthorization Authorization,
		IBusModelValueByUNameIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the TimestampType instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByScopeIdx( ISecureAuthorization Authorization,
		IBusModelValueByScopeIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TimestampType instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the TimestampType instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByPrevIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the TimestampType instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByNextIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the TimestampType instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByContPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TimestampType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 */
	void deleteTimestampTypeByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the TimestampType instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTimestampTypeByContNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByContNextIdxKey argKey );


	/**
	 *	Read the derived TimestampType record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampType instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTimestampType readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived TimestampType record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTimestampType lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all TimestampType instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived TimestampType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTimestampType readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived TimestampType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTimestampType readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived TimestampType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTimestampType[] readDerivedBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Read the specific TimestampType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific TimestampType record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TimestampType instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific TimestampType record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TimestampType instances in the database accessible for the Authorization.
	 */
	IBusModelTimestampType[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific TimestampType record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific TimestampType record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific TimestampType record instances identified by the duplicate key SchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SchemaDefId	The TimestampType key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTimestampType[] readRecBySchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SchemaDefId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelTimestampType moveRecUp( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelTimestampType moveRecDown( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
