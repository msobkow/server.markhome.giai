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

public interface ICFGenKbGelPopContextTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelPopContext instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelPopContextObj newInstance();

	/**
	 *	Instantiate a new GelPopContext edition of the specified GelPopContext instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelPopContextEditObj newEditInstance( ICFGenKbGelPopContextObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopContextObj realiseGelPopContext( ICFGenKbGelPopContextObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopContextObj createGelPopContext( ICFGenKbGelPopContextObj Obj );

	/**
	 *	Read a GelPopContext-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPopContext-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPopContextObj readGelPopContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelPopContext-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPopContext-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPopContextObj readGelPopContext( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelPopContextObj readCachedGelPopContext( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelPopContext( ICFGenKbGelPopContextObj obj );

	void deepDisposeGelPopContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopContextObj lockGelPopContext( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelPopContext-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPopContextObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readAllGelPopContext();

	/**
	 *	Return a sorted map of all the GelPopContext-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPopContextObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readAllGelPopContext( boolean forceRead );

	List<ICFGenKbGelPopContextObj> readCachedAllGelPopContext();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPopContextObj readGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPopContextObj readGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelPopContextObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelPopContextObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelPopContextObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelPopContextObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelPopContextObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPopContextObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPopContextObj> readGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelPopContextObj readCachedGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelPopContextObj> readCachedGelPopContextByTenantIdx( long TenantId );

	List<ICFGenKbGelPopContextObj> readCachedGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelPopContextObj> readCachedGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelPopContextObj> readCachedGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelPopContextByTenantIdx( long TenantId );

	void deepDisposeGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPopContextObj updateGelPopContext( ICFGenKbGelPopContextObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelPopContext( ICFGenKbGelPopContextObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPopContext key attribute of the instance generating the id.
	 */
	void deleteGelPopContextByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 */
	void deleteGelPopContextByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 */
	void deleteGelPopContextByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPopContext key attribute of the instance generating the id.
	 */
	void deleteGelPopContextByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPopContext key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPopContext key attribute of the instance generating the id.
	 */
	void deleteGelPopContextByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
