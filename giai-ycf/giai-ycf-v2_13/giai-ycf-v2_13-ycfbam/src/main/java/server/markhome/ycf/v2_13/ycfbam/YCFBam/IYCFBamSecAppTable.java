
// Description: Java 11 DbIO interface for SecApp.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFSec 2.13 Security Services
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFSec.
 *	
 *	Licensed under the Apache License, Version 2.0 (the "License");
 *	you may not use this file except in compliance with the License.
 *	You may obtain a copy of the License at
 *	
 *	http://www.apache.org/licenses/LICENSE-2.0
 *	
 *	Unless required by applicable law or agreed to in writing, software
 *	distributed under the License is distributed on an "AS IS" BASIS,
 *	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *	See the License for the specific language governing permissions and
 *	limitations under the License.
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfbam.YCFBam;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFInt.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;
import org.mssycf.mssycf.v2_13.ycfbam.YCFBamObj.*;

/*
 *	YCFBamSecAppTable database interface for SecApp
 */
public interface IYCFBamSecAppTable
extends IYCFSecSecAppTable,
	IYCFIntSecAppTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecApp( YCFSecAuthorization Authorization,
		YCFSecSecAppBuff Buff );
	/**
	 *	Delete the SecApp instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId );

	/**
	 *	Delete the SecApp instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecAppByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey argKey );
	/**
	 *	Delete the SecApp instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecApp instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecAppByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppByClusterIdxKey argKey );
	/**
	 *	Delete the SecApp instances identified by the key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecApp key attribute of the instance generating the id.
	 *
	 *	@param	argJEEMountName	The SecApp key attribute of the instance generating the id.
	 */
	void deleteSecAppByUJEEMountIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argJEEMountName );

	/**
	 *	Delete the SecApp instances identified by the key UJEEMountIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecAppByUJEEMountIdx( YCFSecAuthorization Authorization,
		YCFSecSecAppByUJEEMountIdxKey argKey );


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
	YCFSecSecAppBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey );

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
	YCFSecSecAppBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey );

	/**
	 *	Read all SecApp instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecAppBuff[] readAllDerived( YCFSecAuthorization Authorization );

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
	YCFSecSecAppBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff readDerivedByUJEEMountIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey );

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
	YCFSecSecAppBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecAppPKey PKey );

	/**
	 *	Read all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	YCFSecSecAppBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecApp buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecApp instances in the database accessible for the Authorization.
	 */
	YCFSecSecAppBuff[] pageAllBuff( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff readBuffByUJEEMountIdx( YCFSecAuthorization Authorization,
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
	YCFSecSecAppBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
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
