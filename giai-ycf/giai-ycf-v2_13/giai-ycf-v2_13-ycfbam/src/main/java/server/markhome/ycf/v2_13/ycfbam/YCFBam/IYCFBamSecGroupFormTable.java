
// Description: Java 11 DbIO interface for SecGroupForm.

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
 *	YCFBamSecGroupFormTable database interface for SecGroupForm
 */
public interface IYCFBamSecGroupFormTable
extends IYCFSecSecGroupFormTable,
	IYCFIntSecGroupFormTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecGroupForm( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormBuff Buff );
	/**
	 *	Delete the SecGroupForm instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByIdIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		long argSecGroupFormId );

	/**
	 *	Delete the SecGroupForm instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecGroupFormByIdIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByClusterIdx( YCFSecAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecGroupForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByClusterIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByClusterIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByGroupIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId );

	/**
	 *	Delete the SecGroupForm instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByGroupIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByGroupIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByAppIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecAppId );

	/**
	 *	Delete the SecGroupForm instances identified by the key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByAppIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByAppIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByFormIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecFormId );

	/**
	 *	Delete the SecGroupForm instances identified by the key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByFormIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByFormIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key UFormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByUFormIdx( YCFSecAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		int argSecFormId );

	/**
	 *	Delete the SecGroupForm instances identified by the key UFormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByUFormIdx( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormByUFormIdxKey argKey );


	/**
	 *	Read the derived SecGroupForm buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroupForm instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGroupFormBuff readDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey );

	/**
	 *	Lock the derived SecGroupForm buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroupForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGroupFormBuff lockDerived( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey );

	/**
	 *	Read all SecGroupForm instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFSecSecGroupFormBuff[] readAllDerived( YCFSecAuthorization Authorization );

	/**
	 *	Read the derived SecGroupForm buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGroupFormBuff readDerivedByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId );

	/**
	 *	Read an array of the derived SecGroupForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGroupFormBuff[] readDerivedByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived SecGroupForm buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGroupFormBuff[] readDerivedByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the derived SecGroupForm buffer instances identified by the duplicate key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGroupFormBuff[] readDerivedByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read an array of the derived SecGroupForm buffer instances identified by the duplicate key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFSecSecGroupFormBuff[] readDerivedByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId );

	/**
	 *	Read the derived SecGroupForm buffer instance identified by the unique key UFormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFSecSecGroupFormBuff readDerivedByUFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Read the specific SecGroupForm buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroupForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff readBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey );

	/**
	 *	Lock the specific SecGroupForm buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroupForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff lockBuff( YCFSecAuthorization Authorization,
		YCFSecSecGroupFormPKey PKey );

	/**
	 *	Read all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	YCFSecSecGroupFormBuff[] readAllBuff( YCFSecAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	YCFSecSecGroupFormBuff[] pageAllBuff( YCFSecAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read the specific SecGroupForm buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff readBuffByIdIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		long SecGroupFormId );

	/**
	 *	Read an array of the specific SecGroupForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] readBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific SecGroupForm buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] readBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the specific SecGroupForm buffer instances identified by the duplicate key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] readBuffByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read an array of the specific SecGroupForm buffer instances identified by the duplicate key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] readBuffByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId );

	/**
	 *	Read the specific SecGroupForm buffer instance identified by the unique key UFormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff readBuffByUFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		int SecFormId );

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] pageBuffByClusterIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] pageBuffByGroupIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] pageBuffByAppIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Read a page array of the specific SecGroupForm buffer instances identified by the duplicate key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFSecSecGroupFormBuff[] pageBuffByFormIdx( YCFSecAuthorization Authorization,
		long ClusterId,
		int SecFormId,
		Long priorClusterId,
		Long priorSecGroupFormId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
