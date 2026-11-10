
// Description: Java 11 DbIO interface for SecGrpMemb.

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
 *	YCFGenKbSecGrpMembTable database interface for SecGrpMemb
 */
public interface IYCFGenKbSecGrpMembTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecGrpMemb( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembBuff Buff );
	/**
	 *	Delete the SecGrpMemb instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		long argSecGrpMembId );

	/**
	 *	Delete the SecGrpMemb instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecGrpMembByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey argKey );
	/**
	 *	Delete the SecGrpMemb instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecGrpMemb instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpMembByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByClusterIdxKey argKey );
	/**
	 *	Delete the SecGrpMemb instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId );

	/**
	 *	Delete the SecGrpMemb instances identified by the key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpMembByGroupIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByGroupIdxKey argKey );
	/**
	 *	Delete the SecGrpMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		UUID argSecUserId );

	/**
	 *	Delete the SecGrpMemb instances identified by the key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpMembByUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByUserIdxKey argKey );
	/**
	 *	Delete the SecGrpMemb instances identified by the key UUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 */
	void deleteSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId,
		UUID argSecUserId );

	/**
	 *	Delete the SecGrpMemb instances identified by the key UUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGrpMembByUUserIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembByUUserIdxKey argKey );


	/**
	 *	Read the derived SecGrpMemb buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpMemb instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGrpMembBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey );

	/**
	 *	Lock the derived SecGrpMemb buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpMemb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGrpMembBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey );

	/**
	 *	Read all SecGrpMemb instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGrpMembBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived SecGrpMemb buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGrpMembBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId );

	/**
	 *	Read an array of the derived SecGrpMemb buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGrpMembBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived SecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGrpMembBuff[] readDerivedByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the derived SecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGrpMembBuff[] readDerivedByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the derived SecGrpMemb buffer instance identified by the unique key UUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGrpMembBuff readDerivedByUUserIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	/**
	 *	Read the specific SecGrpMemb buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpMemb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey );

	/**
	 *	Lock the specific SecGrpMemb buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGrpMemb instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGrpMembPKey PKey );

	/**
	 *	Read all the specific SecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpMemb instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecGrpMembBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read a page of all the specific SecGrpMemb buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGrpMemb instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecGrpMembBuff[] pageAllBuff( YCFGenKbAuthorization Authorization,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Read the specific SecGrpMemb buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGrpMembId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		long SecGrpMembId );

	/**
	 *	Read an array of the specific SecGrpMemb buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific SecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] readBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the specific SecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] readBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId );

	/**
	 *	Read the specific SecGrpMemb buffer instance identified by the unique key UUserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff readBuffByUUserIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		UUID SecUserId );

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] pageBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key GroupIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] pageBuffByGroupIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Read a page array of the specific SecGrpMemb buffer instances identified by the duplicate key UserIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSecUserId	The SecGrpMemb key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGrpMembBuff[] pageBuffByUserIdx( YCFGenKbAuthorization Authorization,
		UUID SecUserId,
		Long priorClusterId,
		Long priorSecGrpMembId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
