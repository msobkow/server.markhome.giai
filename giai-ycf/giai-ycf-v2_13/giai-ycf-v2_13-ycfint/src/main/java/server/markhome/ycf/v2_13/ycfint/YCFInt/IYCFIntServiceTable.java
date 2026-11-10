
// Description: Java 11 DbIO interface for Service.

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
 *	YCFIntServiceTable database interface for Service
 */
public interface IYCFIntServiceTable
extends IYCFSecServiceTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteService( YCFSecAuthorization Authorization,
		YCFSecServiceBuff Buff );
	/**
	 *	Delete the Service instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argServiceId );

	/**
	 *	Delete the Service instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteServiceByIdIdx( YCFSecAuthorization Authorization,
		YCFSecServicePKey argKey );
	/**
	 *	Delete the Service instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the Service instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByClusterIdxKey argKey );
	/**
	 *	Delete the Service instances identified by the key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByHostIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId );

	/**
	 *	Delete the Service instances identified by the key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceByHostIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByHostIdxKey argKey );
	/**
	 *	Delete the Service instances identified by the key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByTypeIdx( YCFSecAuthorization Authorization,
		int argServiceTypeId );

	/**
	 *	Delete the Service instances identified by the key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceByTypeIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByTypeIdxKey argKey );
	/**
	 *	Delete the Service instances identified by the key UTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByUTypeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId,
		int argServiceTypeId );

	/**
	 *	Delete the Service instances identified by the key UTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceByUTypeIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByUTypeIdxKey argKey );
	/**
	 *	Delete the Service instances identified by the key UHostPortIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 */
	void deleteServiceByUHostPortIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argHostNodeId,
		short argHostPort );

	/**
	 *	Delete the Service instances identified by the key UHostPortIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceByUHostPortIdx( YCFSecAuthorization Authorization,
		YCFSecServiceByUHostPortIdxKey argKey );


	/**
	 *	Read the derived Service buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Service instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey );

	/**
	 *	Lock the derived Service buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Service instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey );

	/**
	 *	Read all Service instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecServiceBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived Service buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long ServiceId );

	/**
	 *	Read an array of the derived Service buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecServiceBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived Service buffer instances identified by the duplicate key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecServiceBuff[] readDerivedByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId );

	/**
	 *	Read an array of the derived Service buffer instances identified by the duplicate key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecServiceBuff[] readDerivedByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId );

	/**
	 *	Read the derived Service buffer instance identified by the unique key UTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceBuff readDerivedByUTypeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	/**
	 *	Read the derived Service buffer instance identified by the unique key UHostPortIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceBuff readDerivedByUHostPortIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		short HostPort );

	/**
	 *	Read the specific Service buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Service instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey );

	/**
	 *	Lock the specific Service buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the Service instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecServicePKey PKey );

	/**
	 *	Read all the specific Service buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Service instances in the database accessible for the Authorization.
	 */
	YCFSecServiceBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific Service buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific Service instances in the database accessible for the Authorization.
	 */
	YCFSecServiceBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Read the specific Service buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceId	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long ServiceId );

	/**
	 *	Read an array of the specific Service buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific Service buffer instances identified by the duplicate key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] readBuffByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId );

	/**
	 *	Read an array of the specific Service buffer instances identified by the duplicate key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] readBuffByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId );

	/**
	 *	Read the specific Service buffer instance identified by the unique key UTypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff readBuffByUTypeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		int ServiceTypeId );

	/**
	 *	Read the specific Service buffer instance identified by the unique key UHostPortIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostPort	The Service key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff readBuffByUHostPortIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		short HostPort );

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key HostIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The Service key attribute of the instance generating the id.
	 *
	 *	@param	argHostNodeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] pageBuffByHostIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long HostNodeId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Read a page array of the specific Service buffer instances identified by the duplicate key TypeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The Service key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceBuff[] pageBuffByTypeIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId,
		Long priorClusterId,
		Long priorServiceId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
