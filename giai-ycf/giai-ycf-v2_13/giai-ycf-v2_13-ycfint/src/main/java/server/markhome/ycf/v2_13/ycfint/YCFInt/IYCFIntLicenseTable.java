
// Description: Java 11 DbIO interface for License.

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
 *	YCFIntLicenseTable database interface for License
 */
public interface IYCFIntLicenseTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteLicense( YCFSecAuthorization Authorization,
		YCFIntLicenseBuff Buff );
	/**
	 *	Delete the License instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByIdIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argId );

	/**
	 *	Delete the License instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteLicenseByIdIdx( YCFSecAuthorization Authorization,
		YCFIntLicensePKey argKey );
	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByLicnTenantIdx( YCFSecAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the License instances identified by the key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByLicnTenantIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByLicnTenantIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByDomainIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId );

	/**
	 *	Delete the License instances identified by the key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByDomainIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByDomainIdxKey argKey );
	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 */
	void deleteLicenseByUNameIdx( YCFSecAuthorization Authorization,
		long argTenantId,
		long argTopDomainId,
		String argName );

	/**
	 *	Delete the License instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteLicenseByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntLicenseByUNameIdxKey argKey );


	/**
	 *	Read the derived License buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntLicenseBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey );

	/**
	 *	Lock the derived License buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntLicenseBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey );

	/**
	 *	Read all License instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFIntLicenseBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived License buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntLicenseBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the derived License buffer instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntLicenseBuff[] readDerivedByLicnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived License buffer instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntLicenseBuff[] readDerivedByDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId );

	/**
	 *	Read the derived License buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntLicenseBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Read the specific License buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey );

	/**
	 *	Lock the specific License buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the License instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntLicensePKey PKey );

	/**
	 *	Read all the specific License buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific License instances in the database accessible for the Authorization.
	 */
	YCFIntLicenseBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific License buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argId	The License key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long Id );

	/**
	 *	Read an array of the specific License buffer instances identified by the duplicate key LicnTenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff[] readBuffByLicnTenantIdx( YCFSecAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific License buffer instances identified by the duplicate key DomainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff[] readBuffByDomainIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId );

	/**
	 *	Read the specific License buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argTopDomainId	The License key attribute of the instance generating the id.
	 *
	 *	@param	argName	The License key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntLicenseBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		long TenantId,
		long TopDomainId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
