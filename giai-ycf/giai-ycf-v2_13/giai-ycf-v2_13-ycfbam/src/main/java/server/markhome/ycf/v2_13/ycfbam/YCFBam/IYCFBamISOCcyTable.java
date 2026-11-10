
// Description: Java 11 DbIO interface for ISOCcy.

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
 *	YCFBamISOCcyTable database interface for ISOCcy
 */
public interface IYCFBamISOCcyTable
extends IYCFSecISOCcyTable,
	IYCFIntISOCcyTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOCcy( YCFSecAuthorization Authorization,
		YCFSecISOCcyBuff Buff );
	/**
	 *	Delete the ISOCcy instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByIdIdx( YCFSecAuthorization Authorization,
		short argISOCcyId );

	/**
	 *	Delete the ISOCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOCcyByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyCdIdx( YCFSecAuthorization Authorization,
		String argISOCode );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCcyByCcyCdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyByCcyCdIdxKey argKey );
	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 */
	void deleteISOCcyByCcyNmIdx( YCFSecAuthorization Authorization,
		String argName );

	/**
	 *	Delete the ISOCcy instances identified by the key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCcyByCcyNmIdx( YCFSecAuthorization Authorization,
		YCFSecISOCcyByCcyNmIdxKey argKey );


	/**
	 *	Read the derived ISOCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCcyBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey );

	/**
	 *	Lock the derived ISOCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCcyBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey );

	/**
	 *	Read all ISOCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecISOCcyBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCcyBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCcyBuff readDerivedByCcyCdIdx( YCFSecAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the derived ISOCcy buffer instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCcyBuff readDerivedByCcyNmIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCcyBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey );

	/**
	 *	Lock the specific ISOCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCcyBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCcyPKey PKey );

	/**
	 *	Read all the specific ISOCcy buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCcy instances in the database accessible for the Authorization.
	 */
	YCFSecISOCcyBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCcyBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key CcyCdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCode	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCcyBuff readBuffByCcyCdIdx( YCFSecAuthorization Authorization,
		String ISOCode );

	/**
	 *	Read the specific ISOCcy buffer instance identified by the unique key CcyNmIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The ISOCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCcyBuff readBuffByCcyNmIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
