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

public interface ICFGenKbGelModifierTableObj
{
	ICFGenKbSchemaObj getSchema();
	void setSchema( ICFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelModifier instance.
	 *
	 *	@return	A new instance.
	 */
	ICFGenKbGelModifierObj newInstance();

	/**
	 *	Instantiate a new GelModifier edition of the specified GelModifier instance.
	 *
	 *	@return	A new edition.
	 */
	ICFGenKbGelModifierEditObj newEditInstance( ICFGenKbGelModifierObj orig );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelModifierObj realiseGelModifier( ICFGenKbGelModifierObj Obj );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelModifierObj createGelModifier( ICFGenKbGelModifierObj Obj );

	/**
	 *	Read a GelModifier-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelModifier-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelModifierObj readGelModifier( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelModifier-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelModifier-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	ICFGenKbGelModifierObj readGelModifier( CFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	ICFGenKbGelModifierObj readCachedGelModifier( CFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelModifier( ICFGenKbGelModifierObj obj );

	void deepDisposeGelModifier( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelModifierObj lockGelModifier( CFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelModifier-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelModifierObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelModifierObj> readAllGelModifier();

	/**
	 *	Return a sorted map of all the GelModifier-derived instances in the database.
	 *
	 *	@return	List of ICFGenKbGelModifierObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<ICFGenKbGelModifierObj> readAllGelModifier( boolean forceRead );

	List<ICFGenKbGelModifierObj> readCachedAllGelModifier();

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelModifierObj readGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the CFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	CFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	ICFGenKbGelModifierObj readGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByTenantIdx( long TenantId );

	/**
	 *	Get the map of CFGenKbGelModifierObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of CFGenKbGelModifierObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of CFGenKbGelModifierObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of CFGenKbGelModifierObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Get the map of CFGenKbGelModifierObj instances sorted by their primary keys for the duplicate RemainderIdx key.
	 *
	 *	@param	argRemainderTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@return	List of CFGenKbGelModifierObj cached instances sorted by their primary keys for the duplicate RemainderIdx key,
	 *		which may be an empty set.
	 */
	List<ICFGenKbGelModifierObj> readGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId,
		boolean forceRead );

	ICFGenKbGelModifierObj readCachedGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<ICFGenKbGelModifierObj> readCachedGelModifierByTenantIdx( long TenantId );

	List<ICFGenKbGelModifierObj> readCachedGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<ICFGenKbGelModifierObj> readCachedGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<ICFGenKbGelModifierObj> readCachedGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	void deepDisposeGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelModifierByTenantIdx( long TenantId );

	void deepDisposeGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );

	/**
	 *	Internal use only.
	 */
	ICFGenKbGelModifierObj updateGelModifier( ICFGenKbGelModifierObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelModifier( ICFGenKbGelModifierObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelModifier key attribute of the instance generating the id.
	 */
	void deleteGelModifierByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 */
	void deleteGelModifierByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelModifier key attribute of the instance generating the id.
	 */
	void deleteGelModifierByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelModifier key attribute of the instance generating the id.
	 */
	void deleteGelModifierByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argRemainderTenantId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderGelCacheId	The GelModifier key attribute of the instance generating the id.
	 *
	 *	@param	argRemainderInstId	The GelModifier key attribute of the instance generating the id.
	 */
	void deleteGelModifierByRemainderIdx( Long RemainderTenantId,
		long RemainderGelCacheId,
		Long RemainderInstId );
}
