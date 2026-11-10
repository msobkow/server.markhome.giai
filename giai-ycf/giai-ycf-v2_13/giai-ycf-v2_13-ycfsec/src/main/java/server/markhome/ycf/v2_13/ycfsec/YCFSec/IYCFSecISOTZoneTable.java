
// Description: Java 11 DbIO interface for ISOTZone.

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
 *	YCFSecISOTZoneTable database interface for ISOTZone
 */
public interface IYCFSecISOTZoneTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOTZone( YCFSecAuthorization Authorization,
		YCFSecISOTZoneBuff Buff );
	/**
	 *	Delete the ISOTZone instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIdIdx( YCFSecAuthorization Authorization,
		short argISOTZoneId );

	/**
	 *	Delete the ISOTZone instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOTZoneByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey argKey );
	/**
	 *	Delete the ISOTZone instances identified by the key OffsetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByOffsetIdx( YCFSecAuthorization Authorization,
		short argTZHourOffset,
		short argTZMinOffset );

	/**
	 *	Delete the ISOTZone instances identified by the key OffsetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOTZoneByOffsetIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByOffsetIdxKey argKey );
	/**
	 *	Delete the ISOTZone instances identified by the key UTZNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByUTZNameIdx( YCFSecAuthorization Authorization,
		String argTZName );

	/**
	 *	Delete the ISOTZone instances identified by the key UTZNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOTZoneByUTZNameIdx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByUTZNameIdxKey argKey );
	/**
	 *	Delete the ISOTZone instances identified by the key Iso8601Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 */
	void deleteISOTZoneByIso8601Idx( YCFSecAuthorization Authorization,
		String argIso8601 );

	/**
	 *	Delete the ISOTZone instances identified by the key Iso8601Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOTZoneByIso8601Idx( YCFSecAuthorization Authorization,
		YCFSecISOTZoneByIso8601IdxKey argKey );


	/**
	 *	Read the derived ISOTZone buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOTZone instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOTZoneBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey );

	/**
	 *	Lock the derived ISOTZone buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOTZone instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOTZoneBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey );

	/**
	 *	Read all ISOTZone instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecISOTZoneBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOTZone buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOTZoneBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOTZoneId );

	/**
	 *	Read an array of the derived ISOTZone buffer instances identified by the duplicate key OffsetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecISOTZoneBuff[] readDerivedByOffsetIdx( YCFSecAuthorization Authorization,
		short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Read the derived ISOTZone buffer instance identified by the unique key UTZNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOTZoneBuff readDerivedByUTZNameIdx( YCFSecAuthorization Authorization,
		String TZName );

	/**
	 *	Read an array of the derived ISOTZone buffer instances identified by the duplicate key Iso8601Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecISOTZoneBuff[] readDerivedByIso8601Idx( YCFSecAuthorization Authorization,
		String Iso8601 );

	/**
	 *	Read the specific ISOTZone buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOTZone instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey );

	/**
	 *	Lock the specific ISOTZone buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOTZone instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOTZonePKey PKey );

	/**
	 *	Read all the specific ISOTZone buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOTZone instances in the database accessible for the Authorization.
	 */
	YCFSecISOTZoneBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOTZone buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOTZoneId	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOTZoneId );

	/**
	 *	Read an array of the specific ISOTZone buffer instances identified by the duplicate key OffsetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZHourOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@param	argTZMinOffset	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff[] readBuffByOffsetIdx( YCFSecAuthorization Authorization,
		short TZHourOffset,
		short TZMinOffset );

	/**
	 *	Read the specific ISOTZone buffer instance identified by the unique key UTZNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTZName	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff readBuffByUTZNameIdx( YCFSecAuthorization Authorization,
		String TZName );

	/**
	 *	Read an array of the specific ISOTZone buffer instances identified by the duplicate key Iso8601Idx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIso8601	The ISOTZone key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOTZoneBuff[] readBuffByIso8601Idx( YCFSecAuthorization Authorization,
		String Iso8601 );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
