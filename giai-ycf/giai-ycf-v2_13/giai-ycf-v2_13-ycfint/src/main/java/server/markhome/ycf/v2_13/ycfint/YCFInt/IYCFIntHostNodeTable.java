
// Description: Java 11 DbIO interface for HostNode.

/*
 *	org.mssycf.mssycf.YCFInt
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

package org.mssycf.mssycf.v2_13.ycfint.YCFInt;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSec.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;
import org.mssycf.mssycf.v2_13.ycfint.YCFIntObj.*;

/*
 *	YCFIntHostNodeTable database interface for HostNode
 */
public interface IYCFIntHostNodeTable
extends IYCFSecHostNodeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteHostNode( YCFSecAuthorization Authorization,
		YCFSecHostNodeBuff Buff );
	/**
	 *	Delete the HostNode instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId );

	/**
	 *	Delete the HostNode instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteHostNodeByIdIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey argKey );
	/**
	 *	Delete the HostNode instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the HostNode instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteHostNodeByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByClusterIdxKey argKey );
	/**
	 *	Delete the HostNode instances identified by the key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByUDescrIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argDescription );

	/**
	 *	Delete the HostNode instances identified by the key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteHostNodeByUDescrIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByUDescrIdxKey argKey );
	/**
	 *	Delete the HostNode instances identified by the key HostNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 */
	void deleteHostNodeByHostNameIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		String argHostName );

	/**
	 *	Delete the HostNode instances identified by the key HostNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteHostNodeByHostNameIdx( YCFSecAuthorization Authorization,
		YCFSecHostNodeByHostNameIdxKey argKey );


	/**
	 *	Read the derived HostNode buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the HostNode instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecHostNodeBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey );

	/**
	 *	Lock the derived HostNode buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the HostNode instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecHostNodeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey );

	/**
	 *	Read all HostNode instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecHostNodeBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived HostNode buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecHostNodeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId );

	/**
	 *	Read an array of the derived HostNode buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecHostNodeBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read the derived HostNode buffer instance identified by the unique key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecHostNodeBuff readDerivedByUDescrIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Description );

	/**
	 *	Read the derived HostNode buffer instance identified by the unique key HostNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecHostNodeBuff readDerivedByHostNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String HostName );

	/**
	 *	Read the specific HostNode buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the HostNode instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey );

	/**
	 *	Lock the specific HostNode buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the HostNode instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecHostNodePKey PKey );

	/**
	 *	Read all the specific HostNode buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific HostNode instances in the database accessible for the Authorization.
	 */
	YCFSecHostNodeBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific HostNode buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific HostNode instances in the database accessible for the Authorization.
	 */
	YCFSecHostNodeBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Read the specific HostNode buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId );

	/**
	 *	Read an array of the specific HostNode buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read the specific HostNode buffer instance identified by the unique key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argDescription	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff readBuffByUDescrIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String Description );

	/**
	 *	Read the specific HostNode buffer instance identified by the unique key HostNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@param	argHostName	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff readBuffByHostNameIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		String HostName );

	/**
	 *	Read a page array of the specific HostNode buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The HostNode key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecHostNodeBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorHostNodeId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
