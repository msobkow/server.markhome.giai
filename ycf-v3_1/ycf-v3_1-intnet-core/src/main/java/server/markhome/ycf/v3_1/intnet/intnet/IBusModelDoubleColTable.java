
// Description: Java 25 DbIO interface for DoubleCol.

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
 *	BusModelDoubleColTable database interface for DoubleCol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelDoubleColTable
{
	public static final String TABLE_NAME = "DoubleCol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelDoubleCol createDoubleCol( ISecureAuthorization Authorization,
		IBusModelDoubleCol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelDoubleCol updateDoubleCol( ISecureAuthorization Authorization,
		IBusModelDoubleCol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteDoubleCol( ISecureAuthorization Authorization,
		IBusModelDoubleCol rec );
	/**
	 *	Delete the DoubleCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTableId );

	/**
	 *	Delete the DoubleCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByTableIdx( ISecureAuthorization Authorization,
		IBusModelDoubleColByTableIdxKey argKey );
	/**
	 *	Delete the DoubleCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteDoubleColByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the DoubleCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByUNameIdx( ISecureAuthorization Authorization,
		IBusModelValueByUNameIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the DoubleCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByScopeIdx( ISecureAuthorization Authorization,
		IBusModelValueByScopeIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the DoubleCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the DoubleCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByPrevIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the DoubleCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByNextIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the DoubleCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByContPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByContPrevIdxKey argKey );
	/**
	 *	Delete the DoubleCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 */
	void deleteDoubleColByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the DoubleCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDoubleColByContNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByContNextIdxKey argKey );


	/**
	 *	Read the derived DoubleCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDoubleCol readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived DoubleCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDoubleCol lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all DoubleCol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived DoubleCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDoubleCol readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived DoubleCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDoubleCol readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived DoubleCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDoubleCol[] readDerivedByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );

	/**
	 *	Read the specific DoubleCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific DoubleCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DoubleCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific DoubleCol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DoubleCol instances in the database accessible for the Authorization.
	 */
	IBusModelDoubleCol[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific DoubleCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific DoubleCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific DoubleCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The DoubleCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDoubleCol[] readRecByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelDoubleCol moveRecUp( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelDoubleCol moveRecDown( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
