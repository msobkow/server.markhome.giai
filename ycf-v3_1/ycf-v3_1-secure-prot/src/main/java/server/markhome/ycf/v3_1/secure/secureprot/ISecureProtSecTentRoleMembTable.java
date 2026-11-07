
// Description: Java 25 protlic DbIO interface for SecTentRoleMemb.

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

package server.markhome.ycf.v3_1.secure.secureprot;

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
import server.markhome.ycf.v3_1.secure.securepub.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.intnet.intnetpubobj.*;
import server.markhome.ycf.v3_1.secure.securepubobj.*;
import server.markhome.ycf.v3_1.secure.secureprotobj.*;

/*
 *	SecureProtSecTentRoleMembTable protlic database interface for SecTentRoleMemb has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureProtSecTentRoleMembTable
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
	public ISecureProtSecTentRoleMemb protcreateSecTentRoleMemb( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMemb rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecureProtSecTentRoleMemb protupdateSecTentRoleMemb( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMemb rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteSecTentRoleMemb( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMemb rec );
	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentRoleMembByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId,
		String argLoginId );
	/**
	 *	Delete the SecTentRoleMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteSecTentRoleMembByIdIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembPKey argKey );
	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentRoleId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentRoleMembByTentRoleIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSecTentRoleId );

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key TentRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecTentRoleMembByTentRoleIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembByTentRoleIdxKey argKey );
	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	LoginId	The SecTentRoleMemb key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentRoleMembByUserIdx( ISecurePubAuthorization Authorization,
		String argLoginId );

	/**
	 *	Delete the SecTentRoleMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecTentRoleMembByUserIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembByUserIdxKey argKey );


	/**
	 *	Read the derived SecTentRoleMemb record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentRoleMemb protreadDerived( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembPKey PKey );

	/**
	 *	Read the derived SecTentRoleMemb record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentRoleMemb protreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecTentRoleId,
		String LoginId );

	/**
	 *	Lock the derived SecTentRoleMemb record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentRoleMemb instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentRoleMemb protlockDerived( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembPKey PKey );

	/**
	 *	Read all SecTentRoleMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecureProtSecTentRoleMemb[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

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
	public ISecureProtSecTentRoleMemb protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb[] protreadDerivedByTentRoleIdx( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb[] protreadDerivedByUserIdx( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb protreadRec( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembPKey PKey );

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
	public ISecureProtSecTentRoleMemb protreadRec( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb protlockRec( ISecurePubAuthorization Authorization,
		ISecureProtSecTentRoleMembPKey PKey );

	/**
	 *	Read all the specific SecTentRoleMemb record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecTentRoleMemb instances in the database accessible for the Authorization.
	 */
	public ISecureProtSecTentRoleMemb[] protreadAllRec( ISecurePubAuthorization Authorization );

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
	public ISecureProtSecTentRoleMemb protreadRecByIdIdx( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb[] protreadRecByTentRoleIdx( ISecurePubAuthorization Authorization,
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
	public ISecureProtSecTentRoleMemb[] protreadRecByUserIdx( ISecurePubAuthorization Authorization,
		String LoginId );
}
