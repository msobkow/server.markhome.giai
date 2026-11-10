
// Description: Java 11 DbIO interface for SecUser.

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
 *	YCFSecSecUserTable database interface for SecUser
 */
public interface IYCFSecSecUserTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecUser( YCFSecAuthorization Authorization,
		YCFSecSecUserBuff Buff );
	/**
	 *	Delete the SecUser instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByIdIdx( YCFSecAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecUser instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecUserByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByULoginIdx( YCFSecAuthorization Authorization,
		String argLoginId );

	/**
	 *	Delete the SecUser instances identified by the key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByULoginIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByULoginIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByEMConfIdx( YCFSecAuthorization Authorization,
		UUID argEMailConfirmUuid );

	/**
	 *	Delete the SecUser instances identified by the key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByEMConfIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByEMConfIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID argPasswordResetUuid );

	/**
	 *	Delete the SecUser instances identified by the key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByPwdResetIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByPwdResetIdxKey argKey );
	/**
	 *	Delete the SecUser instances identified by the key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 */
	void deleteSecUserByDefDevIdx( YCFSecAuthorization Authorization,
		UUID argDfltDevUserId,
		String argDfltDevName );

	/**
	 *	Delete the SecUser instances identified by the key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecUserByDefDevIdx( YCFSecAuthorization Authorization,
		YCFSecSecUserByDefDevIdxKey argKey );


	/**
	 *	Read the derived SecUser buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecUserBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey );

	/**
	 *	Lock the derived SecUser buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecUserBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey );

	/**
	 *	Read all SecUser instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecUserBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SecUser buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecUserBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the derived SecUser buffer instance identified by the unique key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecUserBuff readDerivedByULoginIdx( YCFSecAuthorization Authorization,
		String LoginId );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecUserBuff[] readDerivedByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecUserBuff[] readDerivedByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid );

	/**
	 *	Read an array of the derived SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecUserBuff[] readDerivedByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Read the specific SecUser buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey );

	/**
	 *	Lock the specific SecUser buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecUser instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecUserPKey PKey );

	/**
	 *	Read all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	YCFSecSecUserBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecUser buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecUser instances in the database accessible for the Authorization.
	 */
	YCFSecSecUserBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		UUID priorSecUserId );

	/**
	 *	Read the specific SecUser buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the specific SecUser buffer instance identified by the unique key ULoginIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLoginId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff readBuffByULoginIdx( YCFSecAuthorization Authorization,
		String LoginId );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] readBuffByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] readBuffByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid );

	/**
	 *	Read an array of the specific SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] readBuffByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key EMConfIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argEMailConfirmUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] pageBuffByEMConfIdx( YCFSecAuthorization Authorization,
		UUID EMailConfirmUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key PwdResetIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPasswordResetUuid	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] pageBuffByPwdResetIdx( YCFSecAuthorization Authorization,
		UUID PasswordResetUuid,
		UUID priorSecUserId );

	/**
	 *	Read a page array of the specific SecUser buffer instances identified by the duplicate key DefDevIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argDfltDevUserId	The SecUser key attribute of the instance generating the id.
	 *
	 *	@param	argDfltDevName	The SecUser key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecUserBuff[] pageBuffByDefDevIdx( YCFSecAuthorization Authorization,
		UUID DfltDevUserId,
		String DfltDevName,
		UUID priorSecUserId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
