
// Description: Java 11 DbIO interface for SecDevice.

/*
 *	org.mssycf.mssycf.YCFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory YCFCore 2.13 Generation Knowledgebase
 *	
 *	This program is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *	the Free Software Foundation, either version 3 of the License, or
 *	(at your option) any later version.
 *	
 *	This program is distributed in the hope that it will be useful,
 *	but WITHOUT ANY WARRANTY; without even the implied warranty of
 *	MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *	GNU General Public License for more details.
 *	
 *	You should have received a copy of the GNU General Public License
 *	along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *	
 *	If you wish to modify and use this code without publishing your changes,
 *	or integrate it with proprietary code, please contact Mark Stephen Sobkow
 *	for a commercial license at mark.sobkow@gmail.com
 *
 *	Manufactured by MSS Code Factory 2.12
 */

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb;

import java.lang.reflect.*;
import java.net.*;
import java.rmi.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

/*
 *	YCFGenKbSecDeviceTable database interface for SecDevice
 */
public interface IYCFGenKbSecDeviceTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecDevice( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceBuff Buff );
	/**
	 *	Delete the SecDevice instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByIdIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		String argDevName );

	/**
	 *	Delete the SecDevice instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecDeviceByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey argKey );
	/**
	 *	Delete the SecDevice instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 *
	 *	@param	argDevName	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByNameIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId,
		String argDevName );

	/**
	 *	Delete the SecDevice instances identified by the key NameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecDeviceByNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceByNameIdxKey argKey );
	/**
	 *	Delete the SecDevice instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecDevice key attribute of the instance generating the id.
	 */
	void deleteSecDeviceByUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecDevice instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecDeviceByUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDeviceByUserIdxKey argKey );


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
	YCFGenKbSecDeviceBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey );

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
	YCFGenKbSecDeviceBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey );

	/**
	 *	Read all SecDevice instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecDeviceBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

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
	YCFGenKbSecDeviceBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff readDerivedByNameIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff[] readDerivedByUserIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey );

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
	YCFGenKbSecDeviceBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecDevicePKey PKey );

	/**
	 *	Read all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecDeviceBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecDevice buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecDevice instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecDeviceBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff readBuffByNameIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff[] readBuffByUserIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecDeviceBuff[] pageBuffByUserIdx( YCFGenKbAuthorization Authorization,
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
