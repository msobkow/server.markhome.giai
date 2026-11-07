
// Description: Java 25 DbIO interface for TableTweak.

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

package server.markhome.ycf.v3_1.busmodel.busmodel;

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
 *	BusModelTableTweakTable database interface for TableTweak has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelTableTweakTable
{
	public static final String TABLE_NAME = "TableTweak";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelTableTweak createTableTweak( ISecureAuthorization Authorization,
		IBusModelTableTweak rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelTableTweak updateTableTweak( ISecureAuthorization Authorization,
		IBusModelTableTweak rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteTableTweak( ISecureAuthorization Authorization,
		IBusModelTableTweak rec );
	/**
	 *	Delete the TableTweak instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTableId );

	/**
	 *	Delete the TableTweak instances identified by the key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByTableIdx( ISecureAuthorization Authorization,
		IBusModelTableTweakByTableIdxKey argKey );
	/**
	 *	Delete the TableTweak instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTableTweakByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the TableTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the TableTweak instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByUNameIdx( ISecureAuthorization Authorization,
		IBusModelTweakByUNameIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByValTentIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the TableTweak instances identified by the key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByValTentIdx( ISecureAuthorization Authorization,
		IBusModelTweakByValTentIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the TableTweak instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByScopeIdx( ISecureAuthorization Authorization,
		IBusModelTweakByScopeIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the TableTweak instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelTweakByDefSchemaIdxKey argKey );
	/**
	 *	Delete the TableTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 */
	void deleteTableTweakByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argDefSchemaTenantId,
		ICFKeyHash256 argDefSchemaId,
		String argName );

	/**
	 *	Delete the TableTweak instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTableTweakByUDefIdx( ISecureAuthorization Authorization,
		IBusModelTweakByUDefIdxKey argKey );


	/**
	 *	Read the derived TableTweak record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTableTweak readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived TableTweak record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTableTweak lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all TableTweak instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelTableTweak[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived TableTweak record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTableTweak readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived TableTweak record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTableTweak readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived TableTweak record instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTableTweak[] readDerivedByValTentIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived TableTweak record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTableTweak[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived TableTweak record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTableTweak[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read the derived TableTweak record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelTableTweak readDerivedByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Read an array of the derived TableTweak record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelTableTweak[] readDerivedByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );

	/**
	 *	Read the specific TableTweak record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific TableTweak record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TableTweak instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific TableTweak record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TableTweak instances in the database accessible for the Authorization.
	 */
	IBusModelTableTweak[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific TableTweak record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific TableTweak record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific TableTweak record instances identified by the duplicate key ValTentIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak[] readRecByValTentIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific TableTweak record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific TableTweak record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read the specific TableTweak record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	ScopeId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaTenantId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@param	Name	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak readRecByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaTenantId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Read an array of the specific TableTweak record instances identified by the duplicate key TableIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TableId	The TableTweak key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelTableTweak[] readRecByTableIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TableId );
}
