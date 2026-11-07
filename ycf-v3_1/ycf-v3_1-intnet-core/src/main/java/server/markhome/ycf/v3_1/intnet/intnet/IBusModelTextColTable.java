
// Description: Java 25 DbIO interface for TextCol.

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
 *	BusModelTextColTable database interface for TextCol has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelTextColTable
{
	public static final String TABLE_NAME = "TextCol";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelTextCol createTextCol( ISecureAuthorization Authorization,
		IBusModelTextCol rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelTextCol updateTextCol( ISecureAuthorization Authorization,
		IBusModelTextCol rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteTextCol( ISecureAuthorization Authorization,
		IBusModelTextCol rec );
	/**
	 *	Delete the TextCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTableId );

	/**
	 *	Delete the TextCol instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByTableIdx( ISecureAuthorization Authorization,
		IBusModelTextColByTableIdxKey argKey );
	/**
	 *	Delete the TextCol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTextColByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the TextCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TextCol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByUNameIdx( ISecureAuthorization Authorization,
		IBusModelValueByUNameIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the TextCol instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByScopeIdx( ISecureAuthorization Authorization,
		IBusModelValueByScopeIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TextCol instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelValueByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the TextCol instances identified by the key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByPrevIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the TextCol instances identified by the key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByNextIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argPrevId );

	/**
	 *	Delete the TextCol instances identified by the key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByContPrevIdx( ISecureAuthorization Authorization,
		IBusModelValueByContPrevIdxKey argKey );
	/**
	 *	Delete the TextCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 */
	void deleteTextColByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argNextId );

	/**
	 *	Delete the TextCol instances identified by the key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTextColByContNextIdx( ISecureAuthorization Authorization,
		IBusModelValueByContNextIdxKey argKey );


	/**
	 *	Read the derived TextCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TextCol instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTextCol readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived TextCol record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TextCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTextCol lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all TextCol instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived TextCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTextCol readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived TextCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTextCol readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the derived TextCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTextCol[] readDerivedByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );

	/**
	 *	Read the specific TextCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TextCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific TextCol record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TextCol instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific TextCol record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TextCol instances in the database accessible for the Authorization.
	 */
	IBusModelTextCol[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific TextCol record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific TextCol record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key PrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key NextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key ContPrevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	PrevId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByContPrevIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 PrevId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key ContNextIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@param	NextId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByContNextIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 NextId );

	/**
	 *	Read an array of the specific TextCol record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TextCol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTextCol[] readRecByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );

	/**
	 *	Move the specified record up in the chain (i.e. to the previous position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelTextCol moveRecUp( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );

	/**
	 *	Move the specified record down in the chain (i.e. to the next position.)
	 *
	 *	@return	The refreshed record after it has been moved
	 */
	IBusModelTextCol moveRecDown( ISecureAuthorization Authorization,
		ICFKeyHash256 Id,
		int revision );
}
