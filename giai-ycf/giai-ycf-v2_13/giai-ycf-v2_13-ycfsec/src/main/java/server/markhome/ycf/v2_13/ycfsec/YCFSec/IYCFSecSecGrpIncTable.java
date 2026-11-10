
// Description: Java 11 DbIO interface for SecGrpInc.

/*
 *	org.mssycf.mssycf.YCFSec
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

package org.mssycf.mssycf.v2_13.ycfsec.YCFSec;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfsec.YCFSecObj.*;

/*
 *	YCFSecSecGrpIncTable database interface for SecGrpInc
 */
public interface IYCFSecSecGrpIncTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecGrpInc( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncBuff Buff );
	/**
	 *	Delete the SecGrpInc instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argSecGrpIncId );

	/**
	 *	Delete the SecGrpInc instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecGrpIncByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey argKey );
	/**
	 *	Delete the SecGrpInc instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecGrpInc instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpIncByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByClusterIdxKey argKey );
	/**
	 *	Delete the SecGrpInc instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId );

	/**
	 *	Delete the SecGrpInc instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpIncByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByGroupIdxKey argKey );
	/**
	 *	Delete the SecGrpInc instances identified by the key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argIncludeGroupId );

	/**
	 *	Delete the SecGrpInc instances identified by the key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpIncByIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByIncludeIdxKey argKey );
	/**
	 *	Delete the SecGrpInc instances identified by the key UIncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 */
	void deleteSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argIncludeGroupId );

	/**
	 *	Delete the SecGrpInc instances identified by the key UIncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpIncByUIncludeIdx( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncByUIncludeIdxKey argKey );


	/**
	 *	Read the derived SecGrpInc buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpInc instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGrpIncBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey );

	/**
	 *	Lock the derived SecGrpInc buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpInc instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGrpIncBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey );

	/**
	 *	Read all SecGrpInc instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecGrpIncBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SecGrpInc buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGrpIncBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId );

	/**
	 *	Read an array of the derived SecGrpInc buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGrpIncBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived SecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGrpIncBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the derived SecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGrpIncBuff[] readDerivedByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId );

	/**
	 *	Read the derived SecGrpInc buffer instance identified by the unique key UIncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGrpIncBuff readDerivedByUIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	/**
	 *	Read the specific SecGrpInc buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpInc instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey );

	/**
	 *	Lock the specific SecGrpInc buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpInc instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGrpIncPKey PKey );

	/**
	 *	Read all the specific SecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpInc instances in the database accessible for the Authorization.
	 */
	YCFSecSecGrpIncBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecGrpInc buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpInc instances in the database accessible for the Authorization.
	 */
	YCFSecSecGrpIncBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Read the specific SecGrpInc buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpIncId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGrpIncId );

	/**
	 *	Read an array of the specific SecGrpInc buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific SecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the specific SecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] readBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId );

	/**
	 *	Read the specific SecGrpInc buffer instance identified by the unique key UIncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff readBuffByUIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int IncludeGroupId );

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Read a page array of the specific SecGrpInc buffer instances identified by the duplicate key IncludeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@param	argIncludeGroupId	The SecGrpInc key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGrpIncBuff[] pageBuffByIncludeIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int IncludeGroupId,
		Long priorClusterId,
		Long priorSecGrpIncId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
