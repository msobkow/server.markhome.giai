
// Description: Java 11 DbIO interface for SecForm.

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
 *	YCFGenKbSecFormTable database interface for SecForm
 */
public interface IYCFGenKbSecFormTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecForm( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBuff Buff );
	/**
	 *	Delete the SecForm instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecFormId );

	/**
	 *	Delete the SecForm instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecFormByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey argKey );
	/**
	 *	Delete the SecForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecForm instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecFormByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormByClusterIdxKey argKey );
	/**
	 *	Delete the SecForm instances identified by the key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormBySecAppIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId );

	/**
	 *	Delete the SecForm instances identified by the key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecFormBySecAppIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormBySecAppIdxKey argKey );
	/**
	 *	Delete the SecForm instances identified by the key UJEEServletIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 */
	void deleteSecFormByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecAppId,
		String argJEEServletMapName );

	/**
	 *	Delete the SecForm instances identified by the key UJEEServletIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecFormByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormByUJEEServletIdxKey argKey );


	/**
	 *	Read the derived SecForm buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecForm instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecFormBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey );

	/**
	 *	Lock the derived SecForm buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecFormBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey );

	/**
	 *	Read all SecForm instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecFormBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived SecForm buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecFormBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId );

	/**
	 *	Read an array of the derived SecForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecFormBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived SecForm buffer instances identified by the duplicate key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecFormBuff[] readDerivedBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read the derived SecForm buffer instance identified by the unique key UJEEServletIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecFormBuff readDerivedByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Read the specific SecForm buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey );

	/**
	 *	Lock the specific SecForm buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecForm instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecFormPKey PKey );

	/**
	 *	Read all the specific SecForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecForm instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecFormBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecForm buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecForm instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecFormBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Read the specific SecForm buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecFormId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecFormId );

	/**
	 *	Read an array of the specific SecForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific SecForm buffer instances identified by the duplicate key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff[] readBuffBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId );

	/**
	 *	Read the specific SecForm buffer instance identified by the unique key UJEEServletIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argJEEServletMapName	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff readBuffByUJEEServletIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		String JEEServletMapName );

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Read a page array of the specific SecForm buffer instances identified by the duplicate key SecAppIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@param	argSecAppId	The SecForm key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecFormBuff[] pageBuffBySecAppIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecAppId,
		Long priorClusterId,
		Integer priorSecFormId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
