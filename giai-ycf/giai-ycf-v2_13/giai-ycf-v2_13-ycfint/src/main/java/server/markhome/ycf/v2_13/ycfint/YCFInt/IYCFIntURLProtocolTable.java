
// Description: Java 11 DbIO interface for URLProtocol.

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
 *	YCFIntURLProtocolTable database interface for URLProtocol
 */
public interface IYCFIntURLProtocolTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteURLProtocol( YCFSecAuthorization Authorization,
		YCFIntURLProtocolBuff Buff );
	/**
	 *	Delete the URLProtocol instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIdIdx( YCFSecAuthorization Authorization,
		int argURLProtocolId );

	/**
	 *	Delete the URLProtocol instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteURLProtocolByIdIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByUNameIdx( YCFSecAuthorization Authorization,
		String argName );

	/**
	 *	Delete the URLProtocol instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteURLProtocolByUNameIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolByUNameIdxKey argKey );
	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 */
	void deleteURLProtocolByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean argIsSecure );

	/**
	 *	Delete the URLProtocol instances identified by the key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteURLProtocolByIsSecureIdx( YCFSecAuthorization Authorization,
		YCFIntURLProtocolByIsSecureIdxKey argKey );


	/**
	 *	Read the derived URLProtocol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntURLProtocolBuff readDerived( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey );

	/**
	 *	Lock the derived URLProtocol buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntURLProtocolBuff lockDerived( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey );

	/**
	 *	Read all URLProtocol instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFIntURLProtocolBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived URLProtocol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntURLProtocolBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		int URLProtocolId );

	/**
	 *	Read the derived URLProtocol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFIntURLProtocolBuff readDerivedByUNameIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the derived URLProtocol buffer instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFIntURLProtocolBuff[] readDerivedByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean IsSecure );

	/**
	 *	Read the specific URLProtocol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntURLProtocolBuff readBuff( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey );

	/**
	 *	Lock the specific URLProtocol buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the URLProtocol instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntURLProtocolBuff lockBuff( YCFSecAuthorization Authorization,
		YCFIntURLProtocolPKey PKey );

	/**
	 *	Read all the specific URLProtocol buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific URLProtocol instances in the database accessible for the Authorization.
	 */
	YCFIntURLProtocolBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read the specific URLProtocol buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argURLProtocolId	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntURLProtocolBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		int URLProtocolId );

	/**
	 *	Read the specific URLProtocol buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argName	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntURLProtocolBuff readBuffByUNameIdx( YCFSecAuthorization Authorization,
		String Name );

	/**
	 *	Read an array of the specific URLProtocol buffer instances identified by the duplicate key IsSecureIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argIsSecure	The URLProtocol key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFIntURLProtocolBuff[] readBuffByIsSecureIdx( YCFSecAuthorization Authorization,
		boolean IsSecure );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
