
// Description: Java 11 DbIO interface for SecApp.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbSecAppTable database interface for SecApp
 */
public interface IYCFGenKbSecAppTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecApp( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppBuff Buff );
	/**
	 *	Delete the SecApp instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId );

	/**
	 *	Delete the SecApp instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecAppByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey argKey );
	/**
	 *	Delete the SecApp instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecApp instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecAppByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppByClusterIdxKey argKey );
	/**
	 *	Delete the SecApp instances identified by the key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argJEEMountName );

	/**
	 *	Delete the SecApp instances identified by the key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecAppByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppByUJEEMountIdxKey argKey );


	/**
	 *	Read the derived SecApp buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecApp instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecAppBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey );

	/**
	 *	Lock the derived SecApp buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecApp instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecAppBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey );

	/**
	 *	Read all SecApp instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecAppBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived SecApp buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecAppBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read an array of the derived SecApp buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecAppBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read the derived SecApp buffer instance identified by the unique key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecAppBuff readDerivedByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String JEEMountName );

	/**
	 *	Read the specific SecApp buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecApp instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey );

	/**
	 *	Lock the specific SecApp buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecApp instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecAppPKey PKey );

	/**
	 *	Read all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecAppBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecAppBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Read the specific SecApp buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read an array of the specific SecApp buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read the specific SecApp buffer instance identified by the unique key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff readBuffByUJEEMountIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String JEEMountName );

	/**
	 *	Read a page array of the specific SecApp buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecAppBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecAppId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
