
// Description: Java 25 DbIO interface for DelSubDep3.

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
 *	BusModelDelSubDep3Table database interface for DelSubDep3 has CodeVis Public, meaning that any user interface or referencing schema can access it.
 */
public interface IBusModelDelSubDep3Table
{
	public static final String TABLE_NAME = "DelSubDep3";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	IBusModelDelSubDep3 createDelSubDep3( ISecureAuthorization Authorization,
		IBusModelDelSubDep3 rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	IBusModelDelSubDep3 updateDelSubDep3( ISecureAuthorization Authorization,
		IBusModelDelSubDep3 rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteDelSubDep3( ISecureAuthorization Authorization,
		IBusModelDelSubDep3 rec );
	/**
	 *	Delete the DelSubDep3 instances identified by the key DelSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelSubDep2Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep2Id );

	/**
	 *	Delete the DelSubDep3 instances identified by the key DelSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep3ByDelSubDep2Idx( ISecureAuthorization Authorization,
		IBusModelDelSubDep3ByDelSubDep2IdxKey argKey );
	/**
	 *	Delete the DelSubDep3 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDelSubDep2Id,
		String argName );

	/**
	 *	Delete the DelSubDep3 instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep3ByUNameIdx( ISecureAuthorization Authorization,
		IBusModelDelSubDep3ByUNameIdxKey argKey );
	/**
	 *	Delete the DelSubDep3 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argDefSchemaId );

	/**
	 *	Delete the DelSubDep3 instances identified by the key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep3ByDefSchemaIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDefSchemaIdxKey argKey );
	/**
	 *	Delete the DelSubDep3 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argRelationId );

	/**
	 *	Delete the DelSubDep3 instances identified by the key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep3ByDelDepIdx( ISecureAuthorization Authorization,
		IBusModelDelDepByDelDepIdxKey argKey );
	/**
	 *	Delete the DelSubDep3 instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteDelSubDep3ByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the DelSubDep3 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 */
	void deleteDelSubDep3ByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the DelSubDep3 instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteDelSubDep3ByTenantIdx( ISecureAuthorization Authorization,
		IBusModelScopeByTenantIdxKey argKey );


	/**
	 *	Read the derived DelSubDep3 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep3 instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDelSubDep3 readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived DelSubDep3 record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep3 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDelSubDep3 lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all DelSubDep3 instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	IBusModelDelSubDep3[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived DelSubDep3 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDelSubDep3 readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the derived DelSubDep3 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDelSubDep3[] readDerivedByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived DelSubDep3 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDelSubDep3[] readDerivedByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the derived DelSubDep3 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDelSubDep3[] readDerivedByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 RelationId );

	/**
	 *	Read an array of the derived DelSubDep3 record instances identified by the duplicate key DelSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	IBusModelDelSubDep3[] readDerivedByDelSubDep2Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 DelSubDep2Id );

	/**
	 *	Read the derived DelSubDep3 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	IBusModelDelSubDep3 readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DelSubDep2Id,
		String Name );

	/**
	 *	Read the specific DelSubDep3 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep3 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3 readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific DelSubDep3 record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the DelSubDep3 instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3 lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific DelSubDep3 record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific DelSubDep3 instances in the database accessible for the Authorization.
	 */
	IBusModelDelSubDep3[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific DelSubDep3 record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3 readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 Id );

	/**
	 *	Read an array of the specific DelSubDep3 record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3[] readRecByTenantIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific DelSubDep3 record instances identified by the duplicate key DefSchemaIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DefSchemaId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3[] readRecByDefSchemaIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DefSchemaId );

	/**
	 *	Read an array of the specific DelSubDep3 record instances identified by the duplicate key DelDepIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	RelationId	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3[] readRecByDelDepIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 RelationId );

	/**
	 *	Read an array of the specific DelSubDep3 record instances identified by the duplicate key DelSubDep2Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3[] readRecByDelSubDep2Idx( ISecureAuthorization Authorization,
		ICFKeyHash256 DelSubDep2Id );

	/**
	 *	Read the specific DelSubDep3 record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	DelSubDep2Id	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@param	Name	The DelSubDep3 key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	IBusModelDelSubDep3 readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 DelSubDep2Id,
		String Name );
}
