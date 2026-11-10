
// Description: Java 11 DbIO interface for MimeType.

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
 *	YCFIntMimeTypeTable database interface for MimeType
 */
public interface IYCFIntMimeTypeTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteMimeType( YCFSecAuthorization Authorization,
		YCFIntMimeTypeBuff Buff );
	/**
	 *	Delete the MimeType instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByIdIdx( YCFSecAuthorization Authorization,
		int argMimeTypeId );

	/**
	 *	Delete the MimeType instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteMimeTypeByIdIdx( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey argKey );
	/**
	 *	Delete the MimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 */
	void deleteMimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		String argName );

	/**
	 *	Delete the MimeType instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteMimeTypeByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntMimeTypeByUNameIdxKey argKey );


	/**
	 *	Read the derived MimeType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MimeType instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMimeTypeBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey );

	/**
	 *	Lock the derived MimeType buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMimeTypeBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey );

	/**
	 *	Read all MimeType instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFIntMimeTypeBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived MimeType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMimeTypeBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int MimeTypeId );

	/**
	 *	Read the derived MimeType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntMimeTypeBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Read the specific MimeType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMimeTypeBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey );

	/**
	 *	Lock the specific MimeType buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the MimeType instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMimeTypeBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntMimeTypePKey PKey );

	/**
	 *	Read all the specific MimeType buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific MimeType instances in the database accessible for the Authorization.
	 */
	YCFIntMimeTypeBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific MimeType buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argMimeTypeId	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMimeTypeBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int MimeTypeId );

	/**
	 *	Read the specific MimeType buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The MimeType key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntMimeTypeBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
