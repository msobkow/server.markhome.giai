
// Description: Java 11 DbIO interface for SecGroup.

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
 *	YCFGenKbSecGroupTable database interface for SecGroup
 */
public interface IYCFGenKbSecGroupTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSecGroup( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupBuff Buff );
	/**
	 *	Delete the SecGroup instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		int argSecGroupId );

	/**
	 *	Delete the SecGroup instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSecGroupByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey argKey );
	/**
	 *	Delete the SecGroup instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SecGroup instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByClusterIdxKey argKey );
	/**
	 *	Delete the SecGroup instances identified by the key ClusterVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		boolean argIsVisible );

	/**
	 *	Delete the SecGroup instances identified by the key ClusterVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupByClusterVisIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByClusterVisIdxKey argKey );
	/**
	 *	Delete the SecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 */
	void deleteSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		long argClusterId,
		String argName );

	/**
	 *	Delete the SecGroup instances identified by the key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSecGroupByUNameIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupByUNameIdxKey argKey );


	/**
	 *	Read the derived SecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroup instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGroupBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey );

	/**
	 *	Lock the derived SecGroup buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGroupBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey );

	/**
	 *	Read all SecGroup instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGroupBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived SecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGroupBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the derived SecGroup buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGroupBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the derived SecGroup buffer instances identified by the duplicate key ClusterVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSecGroupBuff[] readDerivedByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		boolean IsVisible );

	/**
	 *	Read the derived SecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSecGroupBuff readDerivedByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Name );

	/**
	 *	Read the specific SecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey );

	/**
	 *	Lock the specific SecGroup buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SecGroup instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSecGroupPKey PKey );

	/**
	 *	Read all the specific SecGroup buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SecGroup instances in the database accessible for the Authorization.
	 */
	YCFGenKbSecGroupBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific SecGroup buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argSecGroupId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		int SecGroupId );

	/**
	 *	Read an array of the specific SecGroup buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read an array of the specific SecGroup buffer instances identified by the duplicate key ClusterVisIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argIsVisible	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff[] readBuffByClusterVisIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		boolean IsVisible );

	/**
	 *	Read the specific SecGroup buffer instance identified by the unique key UNameIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@param	argName	The SecGroup key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSecGroupBuff readBuffByUNameIdx( YCFGenKbAuthorization Authorization,
		long ClusterId,
		String Name );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
