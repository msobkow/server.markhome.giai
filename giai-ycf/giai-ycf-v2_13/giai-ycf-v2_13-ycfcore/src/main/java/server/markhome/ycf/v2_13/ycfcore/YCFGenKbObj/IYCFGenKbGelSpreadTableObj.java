// Description: Java 11 Table Object interface for YCFGenKb.

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

package org.mssycf.mssycf.v2_13.ycfcore.YCFGenKbObj;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.*;
import org.mssycf.mssycf.v2_13.ycflib.YCFLib.xml.*;
import org.mssycf.mssycf.v2_13.ycfcore.YCFGenKb.*;

public interface IYCFGenKbGelSpreadTableObj
{
	IYCFGenKbSchemaObj getSchema();
	void setSchema( IYCFGenKbSchemaObj value );

	void minimizeMemory();

	String getTableName();
	String getTableDbName();

	Class getObjQualifyingClass();

	/**
	 *	Instantiate a new GelSpread instance.
	 *
	 *	@return	A new instance.
	 */
	IYCFGenKbGelSpreadObj newInstance();

	/**
	 *	Instantiate a new GelSpread edition of the specified GelSpread instance.
	 *
	 *	@return	A new edition.
	 */
	IYCFGenKbGelSpreadEditObj newEditInstance( IYCFGenKbGelSpreadObj orig );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSpreadObj realiseGelSpread( IYCFGenKbGelSpreadObj Obj );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSpreadObj createGelSpread( IYCFGenKbGelSpreadObj Obj );

	/**
	 *	Read a GelSpread-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSpread-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSpreadObj readGelSpread( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Read a GelSpread-derived instance by it's primary key.
	 *
	 *	@param	pkey	The primary key identifying the instance to read.
	 *
	 *	@return	The GelSpread-derived instance identified by the primary key,
	 *		or null if no such key value exists.
	 */
	IYCFGenKbGelSpreadObj readGelSpread( YCFGenKbGelInstructionPKey pkey,
		boolean forceRead );

	IYCFGenKbGelSpreadObj readCachedGelSpread( YCFGenKbGelInstructionPKey pkey );

	public void reallyDeepDisposeGelSpread( IYCFGenKbGelSpreadObj obj );

	void deepDisposeGelSpread( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSpreadObj lockGelSpread( YCFGenKbGelInstructionPKey pkey );

	/**
	 *	Return a sorted list of all the GelSpread-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSpreadObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readAllGelSpread();

	/**
	 *	Return a sorted map of all the GelSpread-derived instances in the database.
	 *
	 *	@return	List of IYCFGenKbGelSpreadObj instance, sorted by their primary keys, which
	 *		may include an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readAllGelSpread( boolean forceRead );

	List<IYCFGenKbGelSpreadObj> readCachedAllGelSpread();

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj cached instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Get the YCFGenKbGelInstructionObj instance for the primary key attributes.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	YCFGenKbGelInstructionObj refreshed instance for the primary key, or
	 *		null if no such instance exists.
	 */
	IYCFGenKbGelSpreadObj readGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate TenantIdx key.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate TenantIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByTenantIdx( long TenantId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate GelCacheIdx key.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate GelCacheIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelInstructionObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate ChainIdx key.
	 *
	 *	@param	argChainInstTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate ChainIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate BetweenIdx key.
	 *
	 *	@param	argExpandBetween	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate BetweenIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate BetweenIdx key.
	 *
	 *	@param	argExpandBetween	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate BetweenIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByBetweenIdx( String ExpandBetween,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate BeforeIdx key.
	 *
	 *	@param	argExpandBefore	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate BeforeIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByBeforeIdx( String ExpandBefore,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate FirstIdx key.
	 *
	 *	@param	argExpandFirst	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate FirstIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByFirstIdx( String ExpandFirst,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate EachIdx key.
	 *
	 *	@param	argExpandEach	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate EachIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByEachIdx( String ExpandEach,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate LastIdx key.
	 *
	 *	@param	argExpandLast	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate LastIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByLastIdx( String ExpandLast,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate LoneIdx key.
	 *
	 *	@param	argExpandLone	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate LoneIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByLoneIdx( String ExpandLone,
		boolean forceRead );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty );

	/**
	 *	Get the map of YCFGenKbGelSpreadObj instances sorted by their primary keys for the duplicate EmptyIdx key.
	 *
	 *	@param	argExpandEmpty	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@return	List of YCFGenKbGelSpreadObj cached instances sorted by their primary keys for the duplicate EmptyIdx key,
	 *		which may be an empty set.
	 */
	List<IYCFGenKbGelSpreadObj> readGelSpreadByEmptyIdx( String ExpandEmpty,
		boolean forceRead );

	IYCFGenKbGelSpreadObj readCachedGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByTenantIdx( long TenantId );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByBetweenIdx( String ExpandBetween );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByBeforeIdx( String ExpandBefore );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByFirstIdx( String ExpandFirst );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByEachIdx( String ExpandEach );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByLastIdx( String ExpandLast );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByLoneIdx( String ExpandLone );

	List<IYCFGenKbGelSpreadObj> readCachedGelSpreadByEmptyIdx( String ExpandEmpty );

	void deepDisposeGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	void deepDisposeGelSpreadByTenantIdx( long TenantId );

	void deepDisposeGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId );

	void deepDisposeGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	void deepDisposeGelSpreadByBetweenIdx( String ExpandBetween );

	void deepDisposeGelSpreadByBeforeIdx( String ExpandBefore );

	void deepDisposeGelSpreadByFirstIdx( String ExpandFirst );

	void deepDisposeGelSpreadByEachIdx( String ExpandEach );

	void deepDisposeGelSpreadByLastIdx( String ExpandLast );

	void deepDisposeGelSpreadByLoneIdx( String ExpandLone );

	void deepDisposeGelSpreadByEmptyIdx( String ExpandEmpty );

	/**
	 *	Internal use only.
	 */
	IYCFGenKbGelSpreadObj updateGelSpread( IYCFGenKbGelSpreadObj Obj );

	/**
	 *	Internal use only.
	 */
	void deleteGelSpread( IYCFGenKbGelSpreadObj Obj );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelInstId	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByPIdx( long TenantId,
		long GelCacheId,
		long GelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByTenantIdx( long TenantId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argGelCacheId	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByGelCacheIdx( long TenantId,
		long GelCacheId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argChainInstTenantId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelCacheId	The GelSpread key attribute of the instance generating the id.
	 *
	 *	@param	argChainInstGelInstId	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByChainIdx( Long ChainInstTenantId,
		Long ChainInstGelCacheId,
		Long ChainInstGelInstId );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandBetween	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByBetweenIdx( String ExpandBetween );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandBefore	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByBeforeIdx( String ExpandBefore );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandFirst	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByFirstIdx( String ExpandFirst );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEach	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByEachIdx( String ExpandEach );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLast	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByLastIdx( String ExpandLast );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandLone	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByLoneIdx( String ExpandLone );

	/**
	 *	Internal use only.
	 *
	 *	@param	argExpandEmpty	The GelSpread key attribute of the instance generating the id.
	 */
	void deleteGelSpreadByEmptyIdx( String ExpandEmpty );
}
