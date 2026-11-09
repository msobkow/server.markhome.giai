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

public interface ICFGenKbGelPrefixLineTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelPrefixLine instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelPrefixLineObj newInstance();

	/**
	 *	Instantiate a new GelPrefixLine edition of the specified GelPrefixLine instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelPrefixLineEditObj newEditInstance( ICFGenKbGelPrefixLineObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPrefixLineObj realiseGelPrefixLine( ICFGenKbGelPrefixLineObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPrefixLineObj createGelPrefixLine( ICFGenKbGelPrefixLineObj Obj );

	/**
	 *	Read a GelPrefixLine-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPrefixLine-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPrefixLineObj readGelPrefixLine( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelPrefixLine-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelPrefixLine-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelPrefixLineObj readGelPrefixLine( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelPrefixLineObj readCachedGelPrefixLine( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelPrefixLine( ICFGenKbGelPrefixLineObj obj );

	void deepDisposeGelPrefixLine( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPrefixLineObj lockGelPrefixLine( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelPrefixLine-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPrefixLineObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readAllGelPrefixLine();

	/**
	 *	Return a sorted map of all the GelPrefixLine-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelPrefixLineObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readAllGelPrefixLine( boolean forceRead );

	List<ICFGenKbGelPrefixLineObj> readCachedAllGelPrefixLine();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPrefixLineObj readGelPrefixLineByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelPrefixLineObj readGelPrefixLineByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelPrefixLineObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelPrefixLineObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelPrefixLineObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelPrefixLineObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelPrefixLineObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelPrefixLineObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelPrefixLineObj> readGelPrefixLineByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelPrefixLineObj readCachedGelPrefixLineByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelPrefixLineObj> readCachedGelPrefixLineByTenantIdx( long TenantId );

	List<ICFGenKbGelPrefixLineObj> readCachedGelPrefixLineByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelPrefixLineObj> readCachedGelPrefixLineByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelPrefixLineObj> readCachedGelPrefixLineByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelPrefixLineByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelPrefixLineByTenantIdx( long TenantId );

	void deepDisposeGelPrefixLineByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelPrefixLineByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelPrefixLineByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelPrefixLineObj updateGelPrefixLine( ICFGenKbGelPrefixLineObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelPrefixLine( ICFGenKbGelPrefixLineObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 */
	void deleteGelPrefixLineByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 */
	void deleteGelPrefixLineByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 */
	void deleteGelPrefixLineByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelPrefixLine key attribute of the instance generating the id.
	 */
	void deleteGelPrefixLineByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelPrefixLine key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelPrefixLine key attribute of the instance generating the id.
	 */
	void deleteGelPrefixLineByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
