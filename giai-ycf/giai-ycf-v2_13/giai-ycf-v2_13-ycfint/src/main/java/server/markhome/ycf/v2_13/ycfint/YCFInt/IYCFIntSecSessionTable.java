
// Description: Java 11 DbIO interface for SecSession.

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
 *	YCFIntSecSessionTable database interface for SecSession
 */
public interface IYCFIntSecSessionTable
extends IYCFSecSecSessionTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecSession( YCFSecAuthorization Authorization,
		YCFSecSecSessionBuff Buff );
	/**
	 *	Delete the SecSession instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecSessionId );

	/**
	 *	Delete the SecSession instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecSessionByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecUserIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecSession instances identified by the key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSessionBySecUserIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecUserIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecDevIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		String argSecDevName );

	/**
	 *	Delete the SecSession instances identified by the key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSessionBySecDevIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecDevIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByStartIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		Calendar argStart );

	/**
	 *	Delete the SecSession instances identified by the key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSessionByStartIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionByStartIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionByFinishIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId,
		Calendar argFinish );

	/**
	 *	Delete the SecSession instances identified by the key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSessionByFinishIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionByFinishIdxKey argKey );
	/**
	 *	Delete the SecSession instances identified by the key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 */
	void deleteSecSessionBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID argSecProxyId );

	/**
	 *	Delete the SecSession instances identified by the key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecSessionBySecProxyIdx( YCFSecAuthorization Authorization,
		YCFSecSecSessionBySecProxyIdxKey argKey );


	/**
	 *	Read the derived SecSession buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecSessionBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey );

	/**
	 *	Lock the derived SecSession buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecSessionBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey );

	/**
	 *	Read all SecSession instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecSessionBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SecSession buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecSessionBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecSessionId );

	/**
	 *	Read an array of the derived SecSession buffer instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecSessionBuff[] readDerivedBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read an array of the derived SecSession buffer instances identified by the duplicate key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecSessionBuff[] readDerivedBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName );

	/**
	 *	Read the derived SecSession buffer instance identified by the unique key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecSessionBuff readDerivedByStartIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Start );

	/**
	 *	Read an array of the derived SecSession buffer instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecSessionBuff[] readDerivedByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish );

	/**
	 *	Read an array of the derived SecSession buffer instances identified by the duplicate key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecSessionBuff[] readDerivedBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId );

	/**
	 *	Read the specific SecSession buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey );

	/**
	 *	Lock the specific SecSession buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecSession instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecSessionPKey PKey );

	/**
	 *	Read all the specific SecSession buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSession instances in the database accessible for the Authorization.
	 */
	YCFSecSecSessionBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecSession buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecSession instances in the database accessible for the Authorization.
	 */
	YCFSecSecSessionBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecSessionId );

	/**
	 *	Read the specific SecSession buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecSessionId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecSessionId );

	/**
	 *	Read an array of the specific SecSession buffer instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] readBuffBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read an array of the specific SecSession buffer instances identified by the duplicate key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] readBuffBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName );

	/**
	 *	Read the specific SecSession buffer instance identified by the unique key StartIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argStart	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff readBuffByStartIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Start );

	/**
	 *	Read an array of the specific SecSession buffer instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] readBuffByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish );

	/**
	 *	Read an array of the specific SecSession buffer instances identified by the duplicate key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] readBuffBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId );

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] pageBuffBySecUserIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		UUID priorSecSessionId );

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argSecDevName	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] pageBuffBySecDevIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		String SecDevName,
		UUID priorSecSessionId );

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key FinishIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@param	argFinish	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] pageBuffByFinishIdx( YCFSecAuthorization Authorization,
		UUID SecUserId,
		Calendar Finish,
		UUID priorSecSessionId );

	/**
	 *	Read a page array of the specific SecSession buffer instances identified by the duplicate key SecProxyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecProxyId	The SecSession key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecSessionBuff[] pageBuffBySecProxyIdx( YCFSecAuthorization Authorization,
		UUID SecProxyId,
		UUID priorSecSessionId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
