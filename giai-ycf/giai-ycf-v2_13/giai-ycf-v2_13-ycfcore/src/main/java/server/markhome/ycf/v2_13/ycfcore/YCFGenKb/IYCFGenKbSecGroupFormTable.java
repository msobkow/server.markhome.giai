
// Description: Java 11 DbIO interface for SecGroupForm.

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
 *	YCFGenKbSecGroupFormTable database interface for SecGroupForm
 */
public interface IYCFGenKbSecGroupFormTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecGroupForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormBuff Buff );
	/**
	 *	Delete the SecGroupForm instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argSecGroupFormId );

	/**
	 *	Delete the SecGroupForm instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecGroupFormByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecGroupForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByClusterIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByGroupIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId );

	/**
	 *	Delete the SecGroupForm instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByGroupIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByAppIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId );

	/**
	 *	Delete the SecGroupForm instances identified by the key AppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByAppIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByAppIdxKey argKey );
	/**
	 *	Delete the SecGroupForm instances identified by the key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroupForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecGroupForm key attribute of the instance generating the id.
	 */
	void deleteSecGroupFormByFormIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecFormId );

	/**
	 *	Delete the SecGroupForm instances identified by the key FormIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupFormByFormIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByFormIdxKey argKey );
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
	void deleteSecGroupFormByUFormIdx( YCFGenKbAuthorization Authorization,
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
	void deleteSecGroupFormByUFormIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormByUFormIdxKey argKey );


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
	YCFGenKbSecGroupFormBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey );

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
	YCFGenKbSecGroupFormBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey );

	/**
	 *	Read all SecGroupForm instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGroupFormBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

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
	YCFGenKbSecGroupFormBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readDerivedByAppIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readDerivedByFormIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff readDerivedByUFormIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey );

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
	YCFGenKbSecGroupFormBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupFormPKey PKey );

	/**
	 *	Read all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecGroupFormBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecGroupForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroupForm instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecGroupFormBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readBuffByAppIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] readBuffByFormIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff readBuffByUFormIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] pageBuffByAppIdx( YCFGenKbAuthorization Authorization,
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
	YCFGenKbSecGroupFormBuff[] pageBuffByFormIdx( YCFGenKbAuthorization Authorization,
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
