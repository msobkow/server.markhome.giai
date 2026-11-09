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

public interface ICFGenKbGelSwitchTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelSwitch instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelSwitchObj newInstance();

	/**
	 *	Instantiate a new GelSwitch edition of the specified GelSwitch instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelSwitchEditObj newEditInstance( ICFGenKbGelSwitchObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelSwitchObj realiseGelSwitch( ICFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelSwitchObj createGelSwitch( ICFGenKbGelSwitchObj Obj );

	/**
	 *	Read a GelSwitch-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitch-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelSwitchObj readGelSwitch( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelSwitch-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSwitch-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelSwitchObj readGelSwitch( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelSwitchObj readCachedGelSwitch( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelSwitch( ICFGenKbGelSwitchObj obj );

	void deepDisposeGelSwitch( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelSwitchObj lockGelSwitch( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelSwitch-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelSwitchObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readAllGelSwitch();

	/**
	 *	Return a sorted map of all the GelSwitch-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelSwitchObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readAllGelSwitch( boolean forceRead );

	List<ICFGenKbGelSwitchObj> readCachedAllGelSwitch();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelSwitchObj readGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelSwitchObj readGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelSwitchObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelSwitchObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelSwitchObj> readGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	ICFGenKbGelSwitchObj readCachedGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelSwitchObj> readCachedGelSwitchByTenantIdx( long TenantId );

	List<ICFGenKbGelSwitchObj> readCachedGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelSwitchObj> readCachedGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelSwitchByTenantIdx( long TenantId );

	void deepDisposeGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelSwitchObj updateGelSwitch( ICFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelSwitch( ICFGenKbGelSwitchObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSwitch key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSwitch key attribute of the instance generating the id.
	 */
	void deleteGelSwitchByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
