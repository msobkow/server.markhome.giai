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

public interface ICFGenKbGelExecutableTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelExecutable instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelExecutableObj newInstance();

	/**
	 *	Instantiate a new GelExecutable edition of the specified GelExecutable instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelExecutableEditObj newEditInstance( ICFGenKbGelExecutableObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExecutableObj realiseGelExecutable( ICFGenKbGelExecutableObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExecutableObj createGelExecutable( ICFGenKbGelExecutableObj Obj );

	/**
	 *	Read a GelExecutable-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExecutable-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelExecutableObj readGelExecutable( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelExecutable-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExecutable-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelExecutableObj readGelExecutable( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelExecutableObj readCachedGelExecutable( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelExecutable( ICFGenKbGelExecutableObj obj );

	void deepDisposeGelExecutable( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExecutableObj lockGelExecutable( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelExecutable-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelExecutableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readAllGelExecutable();

	/**
	 *	Return a sorted map of all the GelExecutable-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelExecutableObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readAllGelExecutable( boolean forceRead );

	List<ICFGenKbGelExecutableObj> readCachedAllGelExecutable();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelExecutableObj readGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelSequenceObj instances sorted by their primary keys for the duplicate FirstInstIdx key.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate FirstInstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate FirstInstIdx key.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate FirstInstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelSequenceObj instances sorted by their primary keys for the duplicate LastInstIdx key.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate LastInstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate LastInstIdx key.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate LastInstIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate GenItemIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate GenItemIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelExecutableObj instances sorted by their primary keys for the duplicate GenItemIdx key.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExecutableObj cached instances sorted by their primary keys for the duplicate GenItemIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExecutableObj> readGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	ICFGenKbGelExecutableObj readCachedGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByTenantIdx( long TenantId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	List<ICFGenKbGelExecutableObj> readCachedGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelExecutableByTenantIdx( long TenantId );

	void deepDisposeGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	void deepDisposeGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	void deepDisposeGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExecutableObj updateGelExecutable( ICFGenKbGelExecutableObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelExecutable( ICFGenKbGelExecutableObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argFirstInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argFirstInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByFirstInstIdx( Long FirstInstTenantId,
		Long FirstInstGelCacheId,
		Long FirstInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argLastInstTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argLastInstId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByLastInstIdx( Long LastInstTenantId,
		Long LastInstGelCacheId,
		Long LastInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExecutable key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExecutable key attribute of the instance generating the id.
	 */
	void deleteGelExecutableByGenItemIdx( long TenantId,
		long GelCacheId );
}
