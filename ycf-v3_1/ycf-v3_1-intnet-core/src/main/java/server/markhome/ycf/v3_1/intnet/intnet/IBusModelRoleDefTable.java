
// Description: Java 25 DbIO interface for RoleDef.

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
 *	BusModelRoleDefTable database interface for RoleDef has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelRoleDefTable
{
	public static final String TABLE_NAME = "RoleDef";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelRoleDef createRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelRoleDef updateRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteRoleDef( ISecureAuthorization Authorization,
		IBusModelRoleDef rec );
	/**
	 *	Delete the RoleDef instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteRoleDefByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the RoleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		String argName );

	/**
	 *	Delete the RoleDef instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRoleDefByUNameIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByUNameIdxKey argKey );
	/**
	 *	Delete the RoleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId );

	/**
	 *	Delete the RoleDef instances identified by the key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRoleDefByScopeIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByScopeIdxKey argKey );
	/**
	 *	Delete the RoleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the RoleDef instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRoleDefByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByDefSchemaIdxKey argKey );
	/**
	 *	Delete the RoleDef instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 */
	void deleteRoleDefByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argScopeId,
		ICFKeyHash256 argDefSchemaId,
		String argName );

	/**
	 *	Delete the RoleDef instances identified by the key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteRoleDefByUDefIdx( ISecureAuthorization Authorization,
		IBusModelRoleDefByUDefIdxKey argKey );


	/**
	 *	Read the derived RoleDef record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelRoleDef readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived RoleDef record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelRoleDef lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all RoleDef instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelRoleDef[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived RoleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelRoleDef readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the derived RoleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelRoleDef readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the derived RoleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelRoleDef[] readDerivedByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the derived RoleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelRoleDef[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read the derived RoleDef record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelRoleDef readDerivedByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );

	/**
	 *	Read the specific RoleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific RoleDef record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the RoleDef instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific RoleDef record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific RoleDef instances in the database accessible for the Authorization.
	 */
	IBusModelRoleDef[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific RoleDef record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read the specific RoleDef record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		String Name );

	/**
	 *	Read an array of the specific RoleDef record instances identified by the duplicate key ScopeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef[] readRecByScopeIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId );

	/**
	 *	Read an array of the specific RoleDef record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read the specific RoleDef record instance identified by the unique key UDefIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ScopeId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	DefSchemaId	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@param	Name	The RoleDef key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelRoleDef readRecByUDefIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ScopeId,
		ICFKeyHash256 DefSchemaId,
		String Name );
}
