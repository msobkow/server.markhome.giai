
// Description: Java 11 DbIO interface for SecDevice.

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
 *	YCFIntSecDeviceTable database interface for SecDevice
 */
public interface IYCFIntSecDeviceTable
extends IYCFSecSecDeviceTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecDevice( YCFSecAuthorization Authorization,
		YCFSecSecDeviceBuff Buff );
	/**
	 *	Delete the SecDevice instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argDevName );

	/**
	 *	Delete the SecDevice instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecDeviceByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey argKey );
	/**
	 *	Delete the SecDevice instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByNameIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argDevName );

	/**
	 *	Delete the SecDevice instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecDeviceByNameIdx( YCFSecAuthorization Authorization,
		YCFSecSecDeviceByNameIdxKey argKey );
	/**
	 *	Delete the SecDevice instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecDevice instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecDeviceByUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecDeviceByUserIdxKey argKey );


	/**
	 *	Read the derived SecDevice buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecDevice instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecDeviceBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey );

	/**
	 *	Lock the derived SecDevice buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecDevice instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecDeviceBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey );

	/**
	 *	Read all SecDevice instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecDeviceBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SecDevice buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecDeviceBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName );

	/**
	 *	Read the derived SecDevice buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecDeviceBuff readDerivedByNameIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName );

	/**
	 *	Read an array of the derived SecDevice buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecDeviceBuff[] readDerivedByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the specific SecDevice buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecDevice instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey );

	/**
	 *	Lock the specific SecDevice buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecDevice instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecDevicePKey PKey );

	/**
	 *	Read all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	YCFSecSecDeviceBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	YCFSecSecDeviceBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Read the specific SecDevice buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName );

	/**
	 *	Read the specific SecDevice buffer instance identified by the unique key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff readBuffByNameIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String DevName );

	/**
	 *	Read an array of the specific SecDevice buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff[] readBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read a page array of the specific SecDevice buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecDeviceBuff[] pageBuffByUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		UUID priorSecUserId,
		String priorDevName );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
