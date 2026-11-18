
// Description: Java 25 DbIO interface for SecTentRoleMemb.

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
 *	SecureSecTentRoleMembTable database interface for SecTentRoleMemb has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureSecTentRoleMembTable
{
	public static final String TABLE_NAME = "SecTentRoleMemb";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	ISecureSecTentRoleMemb createSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	ISecureSecTentRoleMemb updateSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	void deleteSecTentRoleMemb( ISecureAuthorization Authorization,
		ISecureSecTentRoleMemb rec );
	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleMembByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId );
	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecTentRoleMembByIdIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey argKey );
	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleMembByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId );

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecTentRoleMembByTentRoleIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembByTentRoleIdxKey argKey );
	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	void deleteSecTentRoleMembByUserIdx( ISecureAuthorization Authorization,
		String argLoginId );

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecTentRoleMembByUserIdx( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembByUserIdxKey argKey );


	/**
	 *	Read the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecTentRoleMemb readDerived( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey );

	/**
	 *	Read the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecTentRoleMemb readDerived( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId,
		String LoginId );

	/**
	 *	Lock the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecTentRoleMemb lockDerived( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey );

	/**
	 *	Read all SecTentRoleMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	ISecureSecTentRoleMemb[] readAllDerived( ISecureAuthorization Authorization );

	/**
	 *	Read the derived SecTentRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	ISecureSecTentRoleMemb readDerivedByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId,
		String LoginId );

	/**
	 *	Read an array of the derived SecTentRoleMemb record instances identified by the duplicate key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecTentRoleMemb[] readDerivedByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId );

	/**
	 *	Read an array of the derived SecTentRoleMemb record instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	ISecureSecTentRoleMemb[] readDerivedByUserIdx( ISecureAuthorization Authorization,
		String LoginId );

	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb readRec( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey );

	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb readRec( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId,
		String LoginId );

	/**
	 *	Lock the specific SecTentRoleMemb record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb lockRec( ISecureAuthorization Authorization,
		ISecureSecTentRoleMembPKey PKey );

	/**
	 *	Read all the specific SecTentRoleMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecTentRoleMemb instances in the database accessible for the Authorization.
	 */
	ISecureSecTentRoleMemb[] readAllRec( ISecureAuthorization Authorization );

	/**
	 *	Read the specific SecTentRoleMemb record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb readRecByIdIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId,
		String LoginId );

	/**
	 *	Read an array of the specific SecTentRoleMemb record instances identified by the duplicate key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb[] readRecByTentRoleIdx( ISecureAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId );

	/**
	 *	Read an array of the specific SecTentRoleMemb record instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	ISecureSecTentRoleMemb[] readRecByUserIdx( ISecureAuthorization Authorization,
		String LoginId );
}
