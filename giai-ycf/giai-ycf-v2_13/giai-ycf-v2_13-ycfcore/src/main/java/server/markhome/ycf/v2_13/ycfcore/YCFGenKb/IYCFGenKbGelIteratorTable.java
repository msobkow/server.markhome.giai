
// Description: Java 11 DbIO interface for GelIterator.

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
 *	YCFGenKbGelIteratorTable database interface for GelIterator
 */
public interface IYCFGenKbGelIteratorTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGelIterator( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorBuff Buff );
	/**
	 *	Delete the GelIterator instances identified by the key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByBeforeIdx( YCFGenKbAuthorization Authorization,
		String argExpandBefore );

	/**
	 *	Delete the GelIterator instances identified by the key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByBeforeIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByBeforeIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByFirstIdx( YCFGenKbAuthorization Authorization,
		String argExpandFirst );

	/**
	 *	Delete the GelIterator instances identified by the key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByFirstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByFirstIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEachIdx( YCFGenKbAuthorization Authorization,
		String argExpandEach );

	/**
	 *	Delete the GelIterator instances identified by the key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByEachIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByEachIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLastIdx( YCFGenKbAuthorization Authorization,
		String argExpandLast );

	/**
	 *	Delete the GelIterator instances identified by the key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByLastIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByLastIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByLoneIdx( YCFGenKbAuthorization Authorization,
		String argExpandLone );

	/**
	 *	Delete the GelIterator instances identified by the key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByLoneIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByLoneIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByEmptyIdx( YCFGenKbAuthorization Authorization,
		String argExpandEmpty );

	/**
	 *	Delete the GelIterator instances identified by the key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByEmptyIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelIteratorByEmptyIdxKey argKey );
	/**
	 *	Delete the GelIterator instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId );

	/**
	 *	Delete the GelIterator instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGelIteratorByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GelIterator instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelIterator instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey );
	/**
	 *	Delete the GelIterator instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 */
	void deleteGelIteratorByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId );

	/**
	 *	Delete the GelIterator instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelIteratorByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey );


	/**
	 *	Read the derived GelIterator buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelIterator instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelIteratorBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the derived GelIterator buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelIterator instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelIteratorBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all GelIterator instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GelIterator buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelIteratorBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone );

	/**
	 *	Read an array of the derived GelIterator buffer instances identified by the duplicate key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelIteratorBuff[] readDerivedByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty );

	/**
	 *	Read the specific GelIterator buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelIterator instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the specific GelIterator buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelIterator instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all the specific GelIterator buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GelIterator instances in the database accessible for the Authorization.
	 */
	YCFGenKbGelIteratorBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GelIterator buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key BeforeIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandBefore	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByBeforeIdx( YCFGenKbAuthorization Authorization,
		String ExpandBefore );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key FirstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandFirst	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByFirstIdx( YCFGenKbAuthorization Authorization,
		String ExpandFirst );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key EachIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEach	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByEachIdx( YCFGenKbAuthorization Authorization,
		String ExpandEach );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key LastIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLast	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByLastIdx( YCFGenKbAuthorization Authorization,
		String ExpandLast );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key LoneIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandLone	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByLoneIdx( YCFGenKbAuthorization Authorization,
		String ExpandLone );

	/**
	 *	Read an array of the specific GelIterator buffer instances identified by the duplicate key EmptyIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argExpandEmpty	The GelIterator key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelIteratorBuff[] readBuffByEmptyIdx( YCFGenKbAuthorization Authorization,
		String ExpandEmpty );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
