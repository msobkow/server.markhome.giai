
// Description: Java 25 DbIO interface for SecClusRole.

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

package server.markhome.ycf.v3_1.secure.secure;

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

import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	SecureSecClusRoleTable database interface for SecClusRole has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecClusRoleTable
{
	public static final String TABLE_NAME = "SecClusRole";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ISecureSecClusRole createSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ISecureSecClusRole updateSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteSecClusRole( ISecureAuthorization Authorization,
		ISecureSecClusRole rec );
	/**
	 *	Delete the SecClusRole instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecClusRoleByIdIdx( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ argKey );
	/**
	 *	Delete the SecClusRole instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId );

	/**
	 *	Delete the SecClusRole instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecClusRoleByClusterIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByClusterIdxKey argKey );
	/**
	 *	Delete the SecClusRole instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		String argName );

	/**
	 *	Delete the SecClusRole instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecClusRoleByNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByNameIdxKey argKey );
	/**
	 *	Delete the SecClusRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 */
	void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argClusterId,
		String argName );

	/**
	 *	Delete the SecClusRole instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecClusRoleByUNameIdx( ISecureAuthorization Authorization,
		ISecureSecClusRoleByUNameIdxKey argKey );


	/**
	 *	Read the derived SecClusRole record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecClusRole readDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the derived SecClusRole record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecClusRole lockDerived( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all SecClusRole instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ISecureSecClusRole[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived SecClusRole record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecClusRole readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusRoleId );

	/**
	 *	Read an array of the derived SecClusRole record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecClusRole[] readDerivedByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId );

	/**
	 *	Read an array of the derived SecClusRole record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecClusRole[] readDerivedByNameIdx( ISecureAuthorization Authorization,
		String Name );

	/**
	 *	Read the derived SecClusRole record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecClusRole readDerivedByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String Name );

	/**
	 *	Read the specific SecClusRole record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole readRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Lock the specific SecClusRole record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecClusRole instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole lockRec( ISecureAuthorization Authorization,
		$implCommaIJavaOptAtomType$ PKey );

	/**
	 *	Read all the specific SecClusRole record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecClusRole instances in the database accessible for the Authorization.
	 */
	ISecureSecClusRole[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific SecClusRole record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecClusRoleId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecClusRoleId );

	/**
	 *	Read an array of the specific SecClusRole record instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole[] readRecByClusterIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId );

	/**
	 *	Read an array of the specific SecClusRole record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole[] readRecByNameIdx( ISecureAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific SecClusRole record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	ClusterId	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecClusRole key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecClusRole readRecByUNameIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 ClusterId,
		String Name );
}
