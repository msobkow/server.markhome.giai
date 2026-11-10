
// Description: Java 11 DbIO interface for MinorVersion.

/*
 *	org.mssycf.mssycf.YCFInt
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
 *	YCFIntMinorVersionTable database interface for MinorVersion
 */
public interface IYCFIntMinorVersionTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteMinorVersion( YCFSecAuthorization Authorization,
		YCFIntMinorVersionBuff Buff );
	/**
	 *	Delete the MinorVersion instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the MinorVersion instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteMinorVersionByIdIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the MinorVersion instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByTenantIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByTenantIdxKey argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByMajorVerIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMajorVersionId );

	/**
	 *	Delete the MinorVersion instances identified by the key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByMajorVerIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByMajorVerIdxKey argKey );
	/**
	 *	Delete the MinorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 */
	void deleteMinorVersionByNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argMajorVersionId,
		String argName );

	/**
	 *	Delete the MinorVersion instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMinorVersionByNameIdx( YCFSecAuthorization Authorization,
		YCFIntMinorVersionByNameIdxKey argKey );


	/**
	 *	Read the derived MinorVersion buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMinorVersionBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey );

	/**
	 *	Lock the derived MinorVersion buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMinorVersionBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey );

	/**
	 *	Read all MinorVersion instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFIntMinorVersionBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived MinorVersion buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMinorVersionBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived MinorVersion buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntMinorVersionBuff[] readDerivedByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived MinorVersion buffer instances identified by the duplicate key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntMinorVersionBuff[] readDerivedByMajorVerIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId );

	/**
	 *	Read the derived MinorVersion buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMinorVersionBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId,
		String Name );

	/**
	 *	Read the specific MinorVersion buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey );

	/**
	 *	Lock the specific MinorVersion buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MinorVersion instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntMinorVersionPKey PKey );

	/**
	 *	Read all the specific MinorVersion buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MinorVersion instances in the database accessible for the Authorization.
	 */
	YCFIntMinorVersionBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific MinorVersion buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific MinorVersion buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff[] readBuffByTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific MinorVersion buffer instances identified by the duplicate key MajorVerIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff[] readBuffByMajorVerIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId );

	/**
	 *	Read the specific MinorVersion buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argMajorVersionId	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@param	argName	The MinorVersion key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMinorVersionBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long MajorVersionId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
