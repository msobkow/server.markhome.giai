
// Description: Java 25 protlic DbIO interface for SecTentGrp.

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
 *	SecureProtSecTentGrpTable protlic database interface for SecTentGrp has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureProtSecTentGrpTable
{
	public static final String TABLE_NAME = "SecTentGrp";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecureProtSecTentGrp protcreateSecTentGrp( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrp rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecureProtSecTentGrp protupdateSecTentGrp( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrp rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteSecTentGrp( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrp rec );
	/**
	 *	Delete the SecTentGrp instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteSecTentGrpByIdIdx( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 argKey );
	/**
	 *	Delete the SecTentGrp instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentGrpByTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argTenantId );

	/**
	 *	Delete the SecTentGrp instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecTentGrpByTenantIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrpByTenantIdxKey argKey );
	/**
	 *	Delete the SecTentGrp instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentGrpByNameIdx( ISecurePubAuthorization Authorization,
		String argName );

	/**
	 *	Delete the SecTentGrp instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecTentGrpByNameIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrpByNameIdxKey argKey );
	/**
	 *	Delete the SecTentGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 */
	public void protdeleteSecTentGrpByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argTenantId,
		String argName );

	/**
	 *	Delete the SecTentGrp instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecTentGrpByUNameIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecTentGrpByUNameIdxKey argKey );


	/**
	 *	Read the derived SecTentGrp record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentGrp instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentGrp protreadDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the derived SecTentGrp record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentGrp protlockDerived( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all SecTentGrp instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecureProtSecTentGrp[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived SecTentGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentGrpId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentGrp protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecTentGrpId );

	/**
	 *	Read an array of the derived SecTentGrp record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtSecTentGrp[] protreadDerivedByTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the derived SecTentGrp record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtSecTentGrp[] protreadDerivedByNameIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read the derived SecTentGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecTentGrp protreadDerivedByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId,
		String Name );

	/**
	 *	Read the specific SecTentGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp protreadRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Lock the specific SecTentGrp record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecTentGrp instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp protlockRec( ISecurePubAuthorization Authorization,
		CFDbKeyHash256 PKey );

	/**
	 *	Read all the specific SecTentGrp record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecTentGrp instances in the database accessible for the Authorization.
	 */
	public ISecureProtSecTentGrp[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific SecTentGrp record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecTentGrpId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecTentGrpId );

	/**
	 *	Read an array of the specific SecTentGrp record instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp[] protreadRecByTenantIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId );

	/**
	 *	Read an array of the specific SecTentGrp record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp[] protreadRecByNameIdx( ISecurePubAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific SecTentGrp record instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	TenantId	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@param	Name	The SecTentGrp key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecTentGrp protreadRecByUNameIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 TenantId,
		String Name );
}
