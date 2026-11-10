
// Description: Java 11 DbIO interface for GelExecutable.

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
 *	YCFGenKbGelExecutableTable database interface for GelExecutable
 */
public interface IYCFGenKbGelExecutableTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGelExecutable( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableBuff Buff );
	/**
	 *	Delete the GelExecutable instances identified by the key GenItemIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByGenItemIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelExecutable instances identified by the key GenItemIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByGenItemIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelExecutableByGenItemIdxKey argKey );
	/**
	 *	Delete the GelExecutable instances identified by the key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long argFirstInstTenantId,
		Long argFirstInstGelCacheId,
		Long argFirstInstId );

	/**
	 *	Delete the GelExecutable instances identified by the key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByFirstInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByFirstInstIdxKey argKey );
	/**
	 *	Delete the GelExecutable instances identified by the key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long argLastInstTenantId,
		Long argLastInstGelCacheId,
		Long argLastInstId );

	/**
	 *	Delete the GelExecutable instances identified by the key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByLastInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelSequenceByLastInstIdxKey argKey );
	/**
	 *	Delete the GelExecutable instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId );

	/**
	 *	Delete the GelExecutable instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGelExecutableByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey );
	/**
	 *	Delete the GelExecutable instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GelExecutable instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey );
	/**
	 *	Delete the GelExecutable instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelExecutable instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey );
	/**
	 *	Delete the GelExecutable instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId );

	/**
	 *	Delete the GelExecutable instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelExecutableByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey );


	/**
	 *	Read the derived GelExecutable buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelExecutable instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelExecutableBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the derived GelExecutable buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelExecutable instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelExecutableBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all GelExecutable instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GelExecutable buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelExecutableBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	/**
	 *	Read an array of the derived GelExecutable buffer instances identified by the duplicate key GenItemIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelExecutableBuff[] readDerivedByGenItemIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read the specific GelExecutable buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelExecutable instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the specific GelExecutable buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelExecutable instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all the specific GelExecutable buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GelExecutable instances in the database accessible for the Authorization.
	 */
	YCFGenKbGelExecutableBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GelExecutable buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key FirstInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByFirstInstIdx( YCFGenKbAuthorization Authorization,
		Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key LastInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByLastInstIdx( YCFGenKbAuthorization Authorization,
		Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	/**
	 *	Read an array of the specific GelExecutable buffer instances identified by the duplicate key GenItemIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelExecutableBuff[] readBuffByGenItemIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
