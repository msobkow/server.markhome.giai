
// Description: Java 11 DbIO interface for TSecGroup.

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
 *	YCFBamTSecGroupTable database interface for TSecGroup
 */
public interface IYCFBamTSecGroupTable
extends IYCFSecTSecGroupTable,
	IYCFIntTSecGroupTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteTSecGroup( YCFSecAuthorization Authorization,
		YCFSecTSecGroupBuff Buff );
	/**
	 *	Delete the TSecGroup instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		int argTSecGroupId );

	/**
	 *	Delete the TSecGroup instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteTSecGroupByIdIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the TSecGroup instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByTenantIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByTenantIdxKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByTenantVisIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		boolean argIsVisible );

	/**
	 *	Delete the TSecGroup instances identified by the key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByTenantVisIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByTenantVisIdxKey argKey );
	/**
	 *	Delete the TSecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 */
	void deleteTSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		String argName );

	/**
	 *	Delete the TSecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteTSecGroupByUNameIdx( YCFSecAuthorization Authorization,
		YCFSecTSecGroupByUNameIdxKey argKey );


	/**
	 *	Read the derived TSecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecTSecGroupBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey );

	/**
	 *	Lock the derived TSecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecTSecGroupBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey );

	/**
	 *	Read all TSecGroup instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecTSecGroupBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived TSecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecTSecGroupBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId );

	/**
	 *	Read an array of the derived TSecGroup buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecTSecGroupBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived TSecGroup buffer instances identified by the duplicate key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecTSecGroupBuff[] readDerivedByTenantVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible );

	/**
	 *	Read the derived TSecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecTSecGroupBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey );

	/**
	 *	Lock the specific TSecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the TSecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecTSecGroupPKey PKey );

	/**
	 *	Read all the specific TSecGroup buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific TSecGroup instances in the database accessible for the Authorization.
	 */
	YCFSecTSecGroupBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argTSecGroupId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		int TSecGroupId );

	/**
	 *	Read an array of the specific TSecGroup buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific TSecGroup buffer instances identified by the duplicate key TenantVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff[] readBuffByTenantVisIdx( YCFSecAuthorization Authorization,
		long TenantId,
		boolean IsVisible );

	/**
	 *	Read the specific TSecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The TSecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecTSecGroupBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
