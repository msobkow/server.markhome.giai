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

public interface ICFGenKbGelExpansionTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelExpansion instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelExpansionObj newInstance();

	/**
	 *	Instantiate a new GelExpansion edition of the specified GelExpansion instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelExpansionEditObj newEditInstance( ICFGenKbGelExpansionObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExpansionObj realiseGelExpansion( ICFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExpansionObj createGelExpansion( ICFGenKbGelExpansionObj Obj );

	/**
	 *	Read a GelExpansion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExpansion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelExpansionObj readGelExpansion( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelExpansion-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelExpansion-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelExpansionObj readGelExpansion( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelExpansionObj readCachedGelExpansion( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelExpansion( ICFGenKbGelExpansionObj obj );

	void deepDisposeGelExpansion( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExpansionObj lockGelExpansion( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelExpansion-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelExpansionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readAllGelExpansion();

	/**
	 *	Return a sorted map of all the GelExpansion-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelExpansionObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readAllGelExpansion( boolean forceRead );

	List<ICFGenKbGelExpansionObj> readCachedAllGelExpansion();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelExpansionObj readGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelExpansionObj readGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelExpansionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelExpansionObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelExpansionObj> readGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	ICFGenKbGelExpansionObj readCachedGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelExpansionObj> readCachedGelExpansionByTenantIdx( long TenantId );

	List<ICFGenKbGelExpansionObj> readCachedGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelExpansionObj> readCachedGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelExpansionByTenantIdx( long TenantId );

	void deepDisposeGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelExpansionObj updateGelExpansion( ICFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelExpansion( ICFGenKbGelExpansionObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelExpansion key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelExpansion key attribute of the instance generating the id.
	 */
	void deleteGelExpansionByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );
}
