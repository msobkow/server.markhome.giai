
// Description: Java 11 DbIO interface for GelConstrain.

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
 *	YCFGenKbGelConstrainTable database interface for GelConstrain
 */
public interface IYCFGenKbGelConstrainTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGelConstrain( YCFGenKbAuthorization Authorization,
		YCFGenKbGelConstrainBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGelConstrain( YCFGenKbAuthorization Authorization,
		YCFGenKbGelConstrainBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGelConstrain( YCFGenKbAuthorization Authorization,
		YCFGenKbGelConstrainBuff Buff );
	/**
	 *	Delete the GelConstrain instances identified by the key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long argRemainderTenantId,
		long argRemainderGelCacheId,
		Long argRemainderInstId );

	/**
	 *	Delete the GelConstrain instances identified by the key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelConstrainByRemainderIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelConstrainByRemainderIdxKey argKey );
	/**
	 *	Delete the GelConstrain instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId );

	/**
	 *	Delete the GelConstrain instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGelConstrainByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey );
	/**
	 *	Delete the GelConstrain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GelConstrain instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelConstrainByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey );
	/**
	 *	Delete the GelConstrain instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelConstrain instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelConstrainByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey );
	/**
	 *	Delete the GelConstrain instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 */
	void deleteGelConstrainByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId );

	/**
	 *	Delete the GelConstrain instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelConstrainByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey );


	/**
	 *	Read the derived GelConstrain buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelConstrain instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelConstrainBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the derived GelConstrain buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelConstrain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelConstrainBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all GelConstrain instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGelConstrainBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GelConstrain buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelConstrainBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the derived GelConstrain buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelConstrainBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GelConstrain buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelConstrainBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the derived GelConstrain buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelConstrainBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the derived GelConstrain buffer instances identified by the duplicate key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelConstrainBuff[] readDerivedByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Read the specific GelConstrain buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelConstrain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the specific GelConstrain buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelConstrain instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all the specific GelConstrain buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GelConstrain instances in the database accessible for the Authorization.
	 */
	YCFGenKbGelConstrainBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GelConstrain buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the specific GelConstrain buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GelConstrain buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the specific GelConstrain buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the specific GelConstrain buffer instances identified by the duplicate key RemainderIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argRemainderTenantId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelConstrain key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelConstrainBuff[] readBuffByRemainderIdx( YCFGenKbAuthorization Authorization,
		Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
