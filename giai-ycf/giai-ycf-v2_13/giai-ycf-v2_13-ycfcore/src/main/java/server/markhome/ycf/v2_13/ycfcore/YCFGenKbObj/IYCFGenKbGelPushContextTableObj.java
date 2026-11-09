// Description: Java 11 Table Object interface for CFGenKb.

/*
 *	org.msscf.msscf.CFCore
 *
 *	Copyright (c) 2016-2026 Mark Stephen Sobkow
 *	
 *	MSS Code Factory CFCore 2.13 Generation Knowledgebase
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

package org.msscf.msscf.v2_13.cfcore.CFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.v2_13.cflib.CFLib.*;
import org.msscf.msscf.v2_13.cflib.CFLib.xml.*;
import org.msscf.msscf.v2_13.cfcore.CFGenKb.*;

public interface ICFGenKbGelPushContextTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelPushContext instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelPushContextObj newInstance();

	/**
	 *	Instantiate a new GelPushContext edition of the specified GelPushContext instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelPushContextEditObj newEditInstance( ICFGenKbGelPushContextObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPushContextObj realiseGelPushContext( ICFGenKbGelPushContextObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPushContextObj createGelPushContext( ICFGenKbGelPushContextObj Obj );

	/**
	 *	Read a GelPushContext-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPushContext-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPushContextObj readGelPushContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelPushContext-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPushContext-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPushContextObj readGelPushContext( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelPushContextObj readCachedGelPushContext( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelPushContext( ICFGenKbGelPushContextObj obj );

	void deepDisposeGelPushContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPushContextObj lockGelPushContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelPushContext-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPushContextObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readAllGelPushContext();

	/**
	 *	Return a sorted map of all the GelPushContext-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPushContextObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readAllGelPushContext( boolean forceRead );

	List<ICFGenKbGelPushContextObj> readCachedAllGelPushContext();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPushContextObj readGelPushContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPushContextObj readGelPushContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelPushContextObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelPushContextObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelPushContextObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelPushContextObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelPushContextObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPushContextObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPushContextObj> readGelPushContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelPushContextObj readCachedGelPushContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelPushContextObj> readCachedGelPushContextByTenantIdx( long TenantId );

	List<ICFGenKbGelPushContextObj> readCachedGelPushContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelPushContextObj> readCachedGelPushContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelPushContextObj> readCachedGelPushContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelPushContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelPushContextByTenantIdx( long TenantId );

	void deepDisposeGelPushContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelPushContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelPushContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPushContextObj updateGelPushContext( ICFGenKbGelPushContextObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelPushContext( ICFGenKbGelPushContextObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPushContext key attribute of the instance generating the id.
	 */
	void deleteGelPushContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 */
	void deleteGelPushContextByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 */
	void deleteGelPushContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPushContext key attribute of the instance generating the id.
	 */
	void deleteGelPushContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPushContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPushContext key attribute of the instance generating the id.
	 */
	void deleteGelPushContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
