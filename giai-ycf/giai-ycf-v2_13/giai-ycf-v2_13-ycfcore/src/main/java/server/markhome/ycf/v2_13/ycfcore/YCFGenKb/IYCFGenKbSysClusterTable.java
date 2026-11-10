
// Description: Java 11 DbIO interface for SysCluster.

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
 *	YCFGenKbSysClusterTable database interface for SysCluster
 */
public interface IYCFGenKbSysClusterTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteSysCluster( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterBuff Buff );
	/**
	 *	Delete the SysCluster instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByIdIdx( YCFGenKbAuthorization Authorization,
		int argSingletonId );

	/**
	 *	Delete the SysCluster instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteSysClusterByIdIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey argKey );
	/**
	 *	Delete the SysCluster instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 */
	void deleteSysClusterByClusterIdx( YCFGenKbAuthorization Authorization,
		long argClusterId );

	/**
	 *	Delete the SysCluster instances identified by the key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteSysClusterByClusterIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterByClusterIdxKey argKey );


	/**
	 *	Read the derived SysCluster buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSysClusterBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey );

	/**
	 *	Lock the derived SysCluster buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSysClusterBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey );

	/**
	 *	Read all SysCluster instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbSysClusterBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived SysCluster buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbSysClusterBuff readDerivedByIdIdx( YCFGenKbAuthorization Authorization,
		int SingletonId );

	/**
	 *	Read an array of the derived SysCluster buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbSysClusterBuff[] readDerivedByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Read the specific SysCluster buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSysClusterBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey );

	/**
	 *	Lock the specific SysCluster buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the SysCluster instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSysClusterBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbSysClusterPKey PKey );

	/**
	 *	Read all the specific SysCluster buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific SysCluster instances in the database accessible for the Authorization.
	 */
	YCFGenKbSysClusterBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific SysCluster buffer instance identified by the unique key IdIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSingletonId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSysClusterBuff readBuffByIdIdx( YCFGenKbAuthorization Authorization,
		int SingletonId );

	/**
	 *	Read an array of the specific SysCluster buffer instances identified by the duplicate key ClusterIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argClusterId	The SysCluster key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbSysClusterBuff[] readBuffByClusterIdx( YCFGenKbAuthorization Authorization,
		long ClusterId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
