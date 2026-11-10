
// Description: Java 11 DbIO interface for ServiceType.

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
 *	YCFBamServiceTypeTable database interface for ServiceType
 */
public interface IYCFBamServiceTypeTable
extends IYCFSecServiceTypeTable,
	IYCFIntServiceTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteServiceType( YCFSecAuthorization Authorization,
		YCFSecServiceTypeBuff Buff );
	/**
	 *	Delete the ServiceType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByIdIdx( YCFSecAuthorization Authorization,
		int argServiceTypeId );

	/**
	 *	Delete the ServiceType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteServiceTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey argKey );
	/**
	 *	Delete the ServiceType instances identified by the key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 */
	void deleteServiceTypeByUDescrIdx( YCFSecAuthorization Authorization,
		String argDescription );

	/**
	 *	Delete the ServiceType instances identified by the key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteServiceTypeByUDescrIdx( YCFSecAuthorization Authorization,
		YCFSecServiceTypeByUDescrIdxKey argKey );


	/**
	 *	Read the derived ServiceType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ServiceType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey );

	/**
	 *	Lock the derived ServiceType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ServiceType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey );

	/**
	 *	Read all ServiceType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecServiceTypeBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived ServiceType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId );

	/**
	 *	Read the derived ServiceType buffer instance identified by the unique key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecServiceTypeBuff readDerivedByUDescrIdx( YCFSecAuthorization Authorization,
		String Description );

	/**
	 *	Read the specific ServiceType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ServiceType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey );

	/**
	 *	Lock the specific ServiceType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ServiceType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecServiceTypePKey PKey );

	/**
	 *	Read all the specific ServiceType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ServiceType instances in the database accessible for the Authorization.
	 */
	YCFSecServiceTypeBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific ServiceType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argServiceTypeId	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int ServiceTypeId );

	/**
	 *	Read the specific ServiceType buffer instance identified by the unique key UDescrIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDescription	The ServiceType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecServiceTypeBuff readBuffByUDescrIdx( YCFSecAuthorization Authorization,
		String Description );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
