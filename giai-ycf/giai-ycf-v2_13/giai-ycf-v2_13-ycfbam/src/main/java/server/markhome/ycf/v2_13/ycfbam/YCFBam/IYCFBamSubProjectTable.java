
// Description: Java 11 DbIO interface for SubProject.

/*
 *	org.mssycf.mssycf.YCFBam
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	Mark's Code Fractal YCFInt 2.13 Internet Essentials
 *	
 *	Copyright 2016-2026 Mark Stephen Sobkow
 *	
 *	This file is part of Mark's Code Fractal YCFInt.
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
 *	YCFBamSubProjectTable database interface for SubProject
 */
public interface IYCFBamSubProjectTable
extends IYCFIntSubProjectTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSubProject( YCFSecAuthorization Authorization,
		YCFIntSubProjectBuff Buff );
	/**
	 *	Delete the SubProject instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the SubProject instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSubProjectByIdIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the SubProject instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByTenantIdxKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByTopProjectIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId );

	/**
	 *	Delete the SubProject instances identified by the key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByTopProjectIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByTopProjectIdxKey argKey );
	/**
	 *	Delete the SubProject instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 */
	void deleteSubProjectByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopProjectId,
		String argName );

	/**
	 *	Delete the SubProject instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSubProjectByNameIdx( YCFSecAuthorization Authorization,
		YCFIntSubProjectByNameIdxKey argKey );


	/**
	 *	Read the derived SubProject buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntSubProjectBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey );

	/**
	 *	Lock the derived SubProject buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntSubProjectBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey );

	/**
	 *	Read all SubProject instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFIntSubProjectBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SubProject buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntSubProjectBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived SubProject buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntSubProjectBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived SubProject buffer instances identified by the duplicate key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntSubProjectBuff[] readDerivedByTopProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId );

	/**
	 *	Read the derived SubProject buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntSubProjectBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Read the specific SubProject buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey );

	/**
	 *	Lock the specific SubProject buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SubProject instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntSubProjectPKey PKey );

	/**
	 *	Read all the specific SubProject buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SubProject instances in the database accessible for the Authorization.
	 */
	YCFIntSubProjectBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific SubProject buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific SubProject buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific SubProject buffer instances identified by the duplicate key TopProjectIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff[] readBuffByTopProjectIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId );

	/**
	 *	Read the specific SubProject buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argTopProjectId	The SubProject key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SubProject key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntSubProjectBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopProjectId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
