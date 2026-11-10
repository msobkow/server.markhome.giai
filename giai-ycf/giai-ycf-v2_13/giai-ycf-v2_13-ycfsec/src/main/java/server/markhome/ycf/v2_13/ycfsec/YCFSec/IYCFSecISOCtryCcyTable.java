
// Description: Java 11 DbIO interface for ISOCtryCcy.

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
 *	YCFSecISOCtryCcyTable database interface for ISOCtryCcy
 */
public interface IYCFSecISOCtryCcyTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteISOCtryCcy( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyBuff Buff );
	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByIdIdx( YCFSecAuthorization Authorization,
		short argISOCtryId,
		short argISOCcyId );

	/**
	 *	Delete the ISOCtryCcy instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteISOCtryCcyByIdIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCtryIdx( YCFSecAuthorization Authorization,
		short argISOCtryId );

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCtryCcyByCtryIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyByCtryIdxKey argKey );
	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 */
	void deleteISOCtryCcyByCcyIdx( YCFSecAuthorization Authorization,
		short argISOCcyId );

	/**
	 *	Delete the ISOCtryCcy instances identified by the key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteISOCtryCcyByCcyIdx( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyByCcyIdxKey argKey );


	/**
	 *	Read the derived ISOCtryCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCtryCcyBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey );

	/**
	 *	Lock the derived ISOCtryCcy buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCtryCcyBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey );

	/**
	 *	Read all ISOCtryCcy instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecISOCtryCcyBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived ISOCtryCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecISOCtryCcyBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Read an array of the derived ISOCtryCcy buffer instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecISOCtryCcyBuff[] readDerivedByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the derived ISOCtryCcy buffer instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecISOCtryCcyBuff[] readDerivedByCcyIdx( YCFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Read the specific ISOCtryCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCtryCcyBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey );

	/**
	 *	Lock the specific ISOCtryCcy buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the ISOCtryCcy instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCtryCcyBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecISOCtryCcyPKey PKey );

	/**
	 *	Read all the specific ISOCtryCcy buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific ISOCtryCcy instances in the database accessible for the Authorization.
	 */
	YCFSecISOCtryCcyBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific ISOCtryCcy buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCtryCcyBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		short ISOCtryId,
		short ISOCcyId );

	/**
	 *	Read an array of the specific ISOCtryCcy buffer instances identified by the duplicate key CtryIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCtryId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCtryCcyBuff[] readBuffByCtryIdx( YCFSecAuthorization Authorization,
		short ISOCtryId );

	/**
	 *	Read an array of the specific ISOCtryCcy buffer instances identified by the duplicate key CcyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argISOCcyId	The ISOCtryCcy key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecISOCtryCcyBuff[] readBuffByCcyIdx( YCFSecAuthorization Authorization,
		short ISOCcyId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
