
// Description: Java 25 protlic DbIO interface for SecSysRoleEnables.

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
 *	SecureProtSecSysRoleEnablesTable protlic database interface for SecSysRoleEnables has CodeVis Protected, meaning that any only user interfaces and application code specific to the defining schema can access it.
 */
public interface ISecureProtSecSysRoleEnablesTable
{
	public static final String TABLE_NAME = "SecSysRoleEnables";

	/**
	 *	Create the instance in the database, and update the specified record
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be created.
	 */
	public ISecureProtSecSysRoleEnables protcreateSecSysRoleEnables( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnables rec );


	/**
	 *	Update the instance in the database, and update the specified record
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be updated
	 */
	public ISecureProtSecSysRoleEnables protupdateSecSysRoleEnables( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnables rec );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	rec	The instance interface to be deleted.
	 */
	public void protdeleteSecSysRoleEnables( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnables rec );
	/**
	 *	Delete the SecSysRoleEnables instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	public void protdeleteSecSysRoleEnablesByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId,
		String argEnableName );
	/**
	 *	Delete the SecSysRoleEnables instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	public void protdeleteSecSysRoleEnablesByIdIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesPKey argKey );
	/**
	 *	Delete the SecSysRoleEnables instances identified by the key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	public void protdeleteSecSysRoleEnablesBySysRoleIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 argSecSysRoleId );

	/**
	 *	Delete the SecSysRoleEnables instances identified by the key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecSysRoleEnablesBySysRoleIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesBySysRoleIdxKey argKey );
	/**
	 *	Delete the SecSysRoleEnables instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 */
	public void protdeleteSecSysRoleEnablesByNameIdx( ISecurePubAuthorization Authorization,
		String argEnableName );

	/**
	 *	Delete the SecSysRoleEnables instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	public void protdeleteSecSysRoleEnablesByNameIdx( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesByNameIdxKey argKey );


	/**
	 *	Read the derived SecSysRoleEnables record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be read.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecSysRoleEnables protreadDerived( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesPKey PKey );

	/**
	 *	Read the derived SecSysRoleEnables record instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecSysRoleEnables protreadDerived( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Lock the derived SecSysRoleEnables record instance by protected primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecSysRoleEnables protlockDerived( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesPKey PKey );

	/**
	 *	Read all SecSysRoleEnables instances.
	 *
	 *	@param	Authorization	The session authorization information.	
	 *
	 *	@return An array of derived record instances, potentially with 0 elements in the set.
	 */
	public ISecureProtSecSysRoleEnables[] protreadProtAllDerived( ISecurePubAuthorization Authorization );

	/**
	 *	Read the derived SecSysRoleEnables record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	public ISecureProtSecSysRoleEnables protreadDerivedByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Read an array of the derived SecSysRoleEnables record instances identified by the duplicate key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtSecSysRoleEnables[] protreadDerivedBySysRoleIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId );

	/**
	 *	Read an array of the derived SecSysRoleEnables record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived instances for the specified key, potentially with 0 elements in the set.
	 */
	public ISecureProtSecSysRoleEnables[] protreadDerivedByNameIdx( ISecurePubAuthorization Authorization,
		String EnableName );

	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables protreadRec( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesPKey PKey );

	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables protreadRec( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Lock the specific SecSysRoleEnables record instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSysRoleEnables instance to be locked.
	 *
	 *	@return The record instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables protlockRec( ISecurePubAuthorization Authorization,
		ISecureProtSecSysRoleEnablesPKey PKey );

	/**
	 *	Read all the specific SecSysRoleEnables record instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSysRoleEnables instances in the database accessible for the Authorization.
	 */
	public ISecureProtSecSysRoleEnables[] protreadAllRec( ISecurePubAuthorization Authorization );

	/**
	 *	Read the specific SecSysRoleEnables record instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return The record instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables protreadRecByIdIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId,
		String EnableName );

	/**
	 *	Read an array of the specific SecSysRoleEnables record instances identified by the duplicate key SysRoleIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	SecSysRoleId	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables[] protreadRecBySysRoleIdx( ISecurePubAuthorization Authorization,
		ICFKeyHash256 SecSysRoleId );

	/**
	 *	Read an array of the specific SecSysRoleEnables record instances identified by the duplicate key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	EnableName	The SecSysRoleEnables key attribute of the instance generating the id.
	 *
	 *	@return An array of derived record instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	CFNotSupportedException thrown by client-side implementations.
	 */
	public ISecureProtSecSysRoleEnables[] protreadRecByNameIdx( ISecurePubAuthorization Authorization,
		String EnableName );
}
