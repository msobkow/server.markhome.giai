
// Description: Java 11 DbIO interface for GelCall.

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
 *	YCFGenKbGelCallTable database interface for GelCall
 */
public interface IYCFGenKbGelCallTable
{

	/**
	 *	Create the instance in the database, and update the specified buffer
	 *	with the assigned primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be created.
	 */
	void createGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff );


	/**
	 *	Update the instance in the database, and update the specified buffer
	 *	with any calculated changes imposed by the associated stored procedure.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be updated.
	 */
	void updateGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff );


	/**
	 *	Delete the instance from the database.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	Buff	The buffer to be deleted.
	 */
	void deleteGelCall( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBuff Buff );
	/**
	 *	Delete the GelCall instances identified by the key CacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelCall instances identified by the key CacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByCacheIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key SeqIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallBySeqIdx( YCFGenKbAuthorization Authorization,
		Long argSeqInstTenantId,
		Long argSeqInstGelCacheId,
		Long argSeqInstId );

	/**
	 *	Delete the GelCall instances identified by the key SeqIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallBySeqIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallBySeqIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key CallInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long argCallInstTenantId,
		Long argCallInstGelCacheId,
		Long argCallInstId );

	/**
	 *	Delete the GelCall instances identified by the key CallInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByCallInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByCallInstIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key PrevInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long argPrevInstTenantId,
		Long argPrevInstGelCacheId,
		Long argPrevInstGelInstId );

	/**
	 *	Delete the GelCall instances identified by the key PrevInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByPrevInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByPrevInstIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key NextInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long argNextInstTenantId,
		Long argNextInstGelCacheId,
		Long argNextInstGelInstId );

	/**
	 *	Delete the GelCall instances identified by the key NextInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByNextInstIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelCallByNextInstIdxKey argKey );
	/**
	 *	Delete the GelCall instance identified by the primary key attributes.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByPIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId,
		long argGelInstId );

	/**
	 *	Delete the GelCall instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The primary key identifying the instance to be deleted.
	 */
	void deleteGelCallByPIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByTenantIdx( YCFGenKbAuthorization Authorization,
		long argTenantId );

	/**
	 *	Delete the GelCall instances identified by the key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByTenantIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByTenantIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long argTenantId,
		long argGelCacheId );

	/**
	 *	Delete the GelCall instances identified by the key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByGelCacheIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByGelCacheIdxKey argKey );
	/**
	 *	Delete the GelCall instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 */
	void deleteGelCallByChainIdx( YCFGenKbAuthorization Authorization,
		Long argChainInstTenantId,
		Long argChainInstGelCacheId,
		Long argChainInstGelInstId );

	/**
	 *	Delete the GelCall instances identified by the key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argKey	The key identifying the instances to be deleted.
	 */
	void deleteGelCallByChainIdx( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionByChainIdxKey argKey );


	/**
	 *	Read the derived GelCall buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelCall instance to be read.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelCallBuff readDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the derived GelCall buffer instance by primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelCall instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelCallBuff lockDerived( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all GelCall instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return An array of derived buffer instances, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readAllDerived( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the derived GelCall buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 */
	YCFGenKbGelCallBuff readDerivedByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key CacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key SeqIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedBySeqIdx( YCFGenKbAuthorization Authorization,
		Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key CallInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key PrevInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	/**
	 *	Read an array of the derived GelCall buffer instances identified by the duplicate key NextInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 */
	YCFGenKbGelCallBuff[] readDerivedByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );

	/**
	 *	Read the specific GelCall buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelCall instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff readBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Lock the specific GelCall buffer instance identified by the primary key.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	PKey	The primary key of the GelCall instance to be locked.
	 *
	 *	@return The buffer instance for the specified primary key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff lockBuff( YCFGenKbAuthorization Authorization,
		YCFGenKbGelInstructionPKey PKey );

	/**
	 *	Read all the specific GelCall buffer instances.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@return All the specific GelCall instances in the database accessible for the Authorization.
	 */
	YCFGenKbGelCallBuff[] readAllBuff( YCFGenKbAuthorization Authorization );

	/**
	 *	Read the specific GelCall buffer instance identified by the unique key PIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return The buffer instance for the specified key, or null if there is
	 *		no such existing key value.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff readBuffByPIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key TenantIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByTenantIdx( YCFGenKbAuthorization Authorization,
		long TenantId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key GelCacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByGelCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key ChainIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argChainInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByChainIdx( YCFGenKbAuthorization Authorization,
		Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key CacheIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByCacheIdx( YCFGenKbAuthorization Authorization,
		long TenantId,
		long GelCacheId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key SeqIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argSeqInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argSeqInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffBySeqIdx( YCFGenKbAuthorization Authorization,
		Long SeqInstTenantId,
		Long SeqInstGelCacheId,
		Long SeqInstId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key CallInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argCallInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argCallInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByCallInstIdx( YCFGenKbAuthorization Authorization,
		Long CallInstTenantId,
		Long CallInstGelCacheId,
		Long CallInstId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key PrevInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argPrevInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argPrevInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByPrevInstIdx( YCFGenKbAuthorization Authorization,
		Long PrevInstTenantId,
		Long PrevInstGelCacheId,
		Long PrevInstGelInstId );

	/**
	 *	Read an array of the specific GelCall buffer instances identified by the duplicate key NextInstIdx.
	 *
	 *	@param	Authorization	The session authorization information.
	 *
	 *	@param	argNextInstTenantId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelCacheId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@param	argNextInstGelInstId	The GelCall key attribute of the instance generating the id.
	 *
	 *	@return An array of derived buffer instances for the specified key, potentially with 0 elements in the set.
	 *
	 *	@throws	YCFLibNotSupportedException thrown by client-side implementations.
	 */
	YCFGenKbGelCallBuff[] readBuffByNextInstIdx( YCFGenKbAuthorization Authorization,
		Long NextInstTenantId,
		Long NextInstGelCacheId,
		Long NextInstGelInstId );

	/**
	 *	Release any prepared statements allocated by this instance.
	 *
	 *	@throws YCFLibNotSupportedException thrown by client-side implementations.
	 */
	void releasePreparedStatements();
}
